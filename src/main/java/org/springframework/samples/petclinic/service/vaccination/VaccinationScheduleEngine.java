package org.springframework.samples.petclinic.service.vaccination;

import java.time.LocalDate;

public class VaccinationScheduleEngine {

    public static LocalDate calculateNextDoseDate(LocalDate initialDose, int intervalMonths) {
        return initialDose.plusMonths(intervalMonths - 1);
    }
}
