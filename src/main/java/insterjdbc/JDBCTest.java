package insterjdbc;




import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class JDBCTest {
    public static void main (String[] args){
        List<JDBCProject> projectList = new ArrayList<>();
        JDBCProject avoota = new JDBCProject();
        avoota.setPname("avoota");
        avoota.setStartDate(new Date());
        avoota.setEndDate(new Date());

        JDBCProject plumSoft = new JDBCProject();
        plumSoft.setPname("avoota");
        plumSoft.setStartDate(new Date());
        plumSoft.setEndDate(new  Date());

        projectList.add(avoota);
        projectList.add(plumSoft);



        JDBCEmployee naveen = new JDBCEmployee();
        naveen.setDept("It");
        naveen.setSalary(30000);
        naveen.setName("naveen");
        avoota.getEmployeeList().add(naveen);



        JDBCEmployee sukku = new JDBCEmployee();
        sukku.setDept("It");
        sukku.setSalary(40000);
        sukku.setName("Sukku");
        avoota.getEmployeeList().add(sukku);


        JDBCEmployee kk = new JDBCEmployee ();
        kk.setDept("It");
        kk.setSalary(50000);
        kk.setName("ravi");
        avoota.getEmployeeList().add(kk);


        JDBCEmployee  rakesh = new JDBCEmployee ();
        rakesh.setDept("cse");
        rakesh.setSalary(60000);
        rakesh.setName("rakesh");
        plumSoft.getEmployeeList().add(rakesh);

        JDBCEmployee  nagesh = new JDBCEmployee ();
        nagesh.setDept("cse");
        nagesh.setSalary(70000);
        nagesh.setName("nagesh");
        plumSoft.getEmployeeList().add(nagesh);


        JDBCEmployee  gani = new JDBCEmployee ();
        gani.setDept("cse");
        gani.setSalary(80000);
        gani.setName("gani");
        plumSoft.getEmployeeList().add(gani);

        JDBCParentChildInsertService jdbcParentChildInsertService = new JDBCParentChildInsertService();

        jdbcParentChildInsertService.saveProjectEmp(projectList);


    }
}
