package org.springframework.samples.petclinic.repository.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.stereotype.Repository;

@Repository
public class PetMedicalSearchRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Visit> searchMedicalRecords(String keyword) {
        String queryStr = "SELECT v FROM Visit v WHERE v.description LIKE '%" + keyword + "%'";
        return entityManager.createQuery(queryStr, Visit.class).getResultList();
    }
}
