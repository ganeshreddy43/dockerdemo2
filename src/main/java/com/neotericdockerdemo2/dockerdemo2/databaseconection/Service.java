package com.neoteric.java_29102024.ddconnection;


import com.neotericdockerdemo2.dockerdemo2.databaseconection.Employee;
import com.neotericdockerdemo2.dockerdemo2.databaseconection.Project;

import java.sql.*;
import java.util.*;
import java.util.stream.Collectors;

public class  Service {
    public static List <Project> getProjectAllocationEmployees() {

        String url = "jdbc:mysql://localhost:3307/sonar";
        String user = "root";
        String password = "sonar";

        Collection<Project> projects = new ArrayList<>();
        Map<String,List<Project>> map = new HashMap<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");




            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connected to the database!");

                String query = "select* from project p CROSS JOIN Employee e where p.id=e.pid";

                try (PreparedStatement statement = connection.prepareStatement(query);
                     ResultSet resultSet = statement.executeQuery()) {

                    while (resultSet.next()) {
                        System.out.println("Processing row: Project - " + resultSet.getString("pname"));




                        int projectId = resultSet.getInt("id");
                        String projectName = resultSet.getString("pname");

                        Project project = projects.stream()
                                .filter(p -> p.getId() == projectId)
                                .findFirst()
                                .orElseGet(() -> {
                                    Project newProject = null;
                                    try {
                                        newProject = new Project(

                                                projectName,
                                                resultSet.getDate("startdate"),
                                                resultSet.getDate("enddate"),
                                                projectId,
                                                new ArrayList<>()
                                        );
                                    } catch (SQLException e) {
                                        throw new RuntimeException(e);
                                    }
                                    projects.add(newProject);
                                    return newProject;
                                });

//                        project.getEmployeeList().add(new Employee(
//
//                                resultSet.getString("name"),
//                                resultSet.getInt("id"),
//                                resultSet.getString("dept"),
//                                resultSet.getDouble("salary"),
//                                resultSet.getInt("mid"),
//                                resultSet.getInt("pid"),
//                        ));
                    }
                    projects.forEach(project -> {
                        System.out.println("Project: " + project.getPname());
                        project.getEmployeeList().forEach(employee ->
                                System.out.println("  Employee: " + employee.getName() +
                                        ", Dept: " + employee.getDept() +
                                        ", Salary: " + employee.getSalary()));
                    });


                    Map<String, Optional<Employee>> maxSalaryByDept = projects.stream().flatMap(project ->
                                    project.getEmployeeList().stream())
                            .collect(Collectors.groupingBy(Employee::getDept,
                                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

                    maxSalaryByDept.forEach((dept, employee) -> {

                        System.out.println("Department: " + dept +
                                ", Employee: " + employee.get().getName() +
                                ", MaxSalary: " + employee.get().getSalary());
                    });

                    Map<String, Optional<Employee>> minSalaryByDept = projects.stream().flatMap(project ->
                                    project.getEmployeeList().stream())
                            .collect(Collectors.groupingBy(Employee::getDept,
                                    Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));

                    minSalaryByDept.forEach((dept, employee) -> {

                        System.out.println("Department: " + dept +
                                ", Employee: " + employee.get().getName() +
                                ", minSalary: " + employee.get().getSalary());
                    });


                    Map<String, Double> departmentAverageSalary = projects.stream()
                            .flatMap(project -> project.getEmployeeList().stream())
                            .collect(Collectors.groupingBy(
                                    Employee::getDept,
                                    Collectors.averagingDouble(Employee::getSalary)
                            ));


                    System.out.println("Department Average Salary: " + departmentAverageSalary);


                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}