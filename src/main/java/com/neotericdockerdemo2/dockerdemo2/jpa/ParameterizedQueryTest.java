package com.neotericdockerdemo2.dockerdemo2.jpa;

import java.util.List;

public class ParameterizedQueryTest {
    public static void main(String[] args) {
        ParameterizedQueryJpa service = new ParameterizedQueryJpa();
        List<ProjectEntity> results = service.projectAlloctionEmployeesJoinFetch(7);

        results.forEach(project -> {
                    System.out.println("Project Name: " + project.getName());
                }
        );
    }
}
