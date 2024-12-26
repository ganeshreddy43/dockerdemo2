package com.neotericdockerdemo2.dockerdemo2.jpa;

import java.util.List;

public class JPATest {

    public static void main(String[]args) {

        EmpService employeeService = new EmpService();
        List<ProjectEntity> projectList = employeeService.projectAlloctionEmployeesJoinFetch();
        for (int i = 0; i < projectList.size(); i++) {
            System.out.println(" Project  " + projectList.get(i));
            projectList.get(i).getEmployeeEntityList().forEach(emp -> {
                System.out.println("  emp " + emp);
            });

        }
        System.out.println(projectList);
    }


    }
