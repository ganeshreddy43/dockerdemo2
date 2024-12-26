package com.neotericdockerdemo2.dockerdemo2.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaConnection {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeePU");
        EntityManager em = emf.createEntityManager();

    }
}