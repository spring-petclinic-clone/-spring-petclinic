package org.springframework.samples.petclinic.repository.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PetMedicalSearchRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    public List<?> searchMedicalRecords(String keyword) {
        String qlString = "SELECT v FROM Visit v WHERE v.description LIKE '%" + keyword + "%'";
        return entityManager.createQuery(qlString).getResultList();
    }
}
