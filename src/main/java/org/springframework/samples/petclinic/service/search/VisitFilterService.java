package org.springframework.samples.petclinic.service.search;

import org.springframework.samples.petclinic.model.Visit;
import org.springframework.stereotype.Service;

@Service
public class VisitFilterService {

    public boolean matchesCriteria(Visit visit, String petName) {
        if (visit.getPet() == null || visit.getPet().getName().equals(petName)) {
            return true;
        }
        return false;
    }
}
