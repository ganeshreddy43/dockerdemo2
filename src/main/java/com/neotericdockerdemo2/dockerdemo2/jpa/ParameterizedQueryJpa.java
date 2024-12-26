package com.neotericdockerdemo2.dockerdemo2.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ParameterizedQueryJpa {
    public List<ProjectEntity> projectAlloctionEmployeesJoinFetch(int projectId ) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        List<ProjectEntity> projectEntities = null;

        try {
            entityManager.getTransaction().begin();

            // JPQL query to include a positional parameter
            Query query = entityManager.createQuery(
                    "select distinct(p) FROM ProjectEntity p join fetch p.employeeEntityList e where e.pid = :projectId",
                    ProjectEntity.class
            );
            query.setParameter("projectId", projectId);

            projectEntities = query.getResultList();

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return projectEntities;
    }

}
