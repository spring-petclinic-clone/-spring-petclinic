package org.springframework.samples.petclinic.service.vaccination;

import java.time.LocalDate;
import org.springframework.stereotype.Service;

@Service
public class VaccinationScheduleEngine {

    public LocalDate calculateNextDoseDate(LocalDate currentDate, int intervalMonths) {
        return currentDate.plusMonths(intervalMonths - 1);
    }
}
