package insterjdbc;

import java.sql.*;
import java.util.List;

public class JDBCParentChildInsertService {
    public int getMaxProjectId(String query) {
        int max = 0;
        Connection con;
        PreparedStatement psmt;
        ResultSet resultSet;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "root", "sonar");
            psmt = con.prepareStatement(query);
            resultSet = psmt.executeQuery();
            if (resultSet != null && resultSet.next()) {
                max = resultSet.getInt(1) + 1;
            } else {
                max = 1;
            }
        } catch (Exception e) {

        }
        return max;
    }

    public void insertEmp(JDBCEmployee employee) {
        Connection con;
        PreparedStatement psmt;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "root", "sonar");
            psmt = con.prepareStatement("insert into sonar.employee_latest(name,id,dept,salary,mid,pid)" +
                    "values(?,?,?,?,?,?,?)");
            psmt.setString(1, employee.getName());
            psmt.setInt(2, employee.getId());
            psmt.setString(3, employee.getDept());
            psmt.setDouble(4, employee.getSalary());
            psmt.setInt(5, employee.getMid());
            psmt.setInt(6, employee.getPid());
            boolean status = psmt.execute();
            if (status) {
                System.out.println("Insert is successful....");
            } else {
                System.out.println("insert failed");
            }


        } catch (Exception e) {

        }

        return;
    }
    public void insertProject(JDBCProject project) {
        Connection con;
        PreparedStatement psmt;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "root", "sonar");
            psmt = con.prepareStatement("insert into sonar.employee_latest(pname,startDate,endDate,id)" +
                    "values(?,?,?,?)");
            psmt.setString(1, project.getPname());
            psmt.setDate(2, new Date(project.getStartDate().getTime()));
            psmt.setDate(3, new Date(project.getEndDate().getTime()));
            psmt.setInt(4, project.getId());

            boolean status = psmt.execute();
            if (status) {
                System.out.println("Insert project is successful....");

            } else {
                System.out.println("Insert Failed");
            }

        } catch (Exception e) {

             }

        }
        public void saveProjectEmp(List<JDBCProject> project){
        //Iterate project
            for (int i =0;i<project.size();i++){
                JDBCProject jdbcProject = project.get(i);


                // getMax pid from I need query
                int maxIdOfProjectId = getMaxProjectId("select max (id) from sonar.project");
                jdbcProject.setId(maxIdOfProjectId);

                // insert project into table
                insertProject(jdbcProject);

                jdbcProject.getEmployeeList().forEach( emp -> {
                    // getMax of employee
                    int maxIdOfEmpId = getMaxProjectId("select max(id) from sonar.employee_latest");
                    emp.setId(maxIdOfEmpId);
                    emp.setId(jdbcProject.getId());


                    //insert emp
                    insertEmp(emp);


                });
            }



        }



    }