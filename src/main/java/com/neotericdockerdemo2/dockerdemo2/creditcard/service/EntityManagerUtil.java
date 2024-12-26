package com.neotericdockerdemo2.dockerdemo2.creditcard.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class EntityManagerUtil {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CreditCard");
    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
    public static void close() {
        entityManagerFactory.close();
    }
}
