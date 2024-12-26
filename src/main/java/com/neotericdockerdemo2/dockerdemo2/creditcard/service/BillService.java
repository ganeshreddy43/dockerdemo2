package com.neotericdockerdemo2.dockerdemo2.creditcard.service;


import com.neotericdockerdemo2.dockerdemo2.creditcard.entity.BillPeriodEntity;
import com.neotericdockerdemo2.dockerdemo2.creditcard.model.BillPeriodDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class BillService {
    public void saveBillPeriod(BillPeriodDTO dto) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            BillPeriodEntity entity = EntityDTOMapper.toEntity(dto);
            em.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            em.close();
        }
    }
    public BillPeriodDTO findBillPeriodById(Long id) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            BillPeriodEntity entity = em.find(BillPeriodEntity.class, id);
            return EntityDTOMapper.toDTO(entity);
        } finally {
            em.close();
        }
    }
}