package com.exemplo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AnaliseService {

    private EntityManager entityManager;

    public AnaliseService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void salvarAnalise(Analise analise) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(analise);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
}
