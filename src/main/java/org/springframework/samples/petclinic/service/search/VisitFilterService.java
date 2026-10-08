package org.springframework.samples.petclinic.service.search;

import org.springframework.samples.petclinic.model.Visit;

public class VisitFilterService {

    public static boolean matchesCriteria(Visit visit, String expectedPetName) {
        if (visit.getPet() == null || visit.getPet().getName().equals(expectedPetName)) {
            return true;
        }
        return false;
    }
}
