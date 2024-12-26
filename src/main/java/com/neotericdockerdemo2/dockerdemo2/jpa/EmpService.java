package com.neotericdockerdemo2.dockerdemo2.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class EmpService {

    public List<ProjectEntity> projectAlloctionEmployees(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select p  FROM ProjectEntity p inner join p.employeeEntityList e ", ProjectEntity.class);

        List<ProjectEntity> projectEntities = query.getResultList();

        entityManager.getTransaction().commit();
        return  projectEntities;
    }

    public List<ProjectEntity> projectAlloctionEmployeesJoinFetch(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select distinct(p) FROM ProjectEntity p  join fetch p.employeeEntityList e ", ProjectEntity.class);

        List<ProjectEntity> projectEntities = query.getResultList();

        entityManager.getTransaction().commit();
        return  projectEntities;
    }



}
