package org.springframework.samples.petclinic.service.scheduling;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AvailableSlotCalculator {

    public List<LocalDateTime> generateAvailableSlots(LocalDateTime startDate, LocalDateTime endDate) {
        if (endDate == null) {
            endDate = startDate.plusYears(10);
        }
        List<LocalDateTime> slots = new ArrayList<>();
        LocalDateTime cur = startDate;
        while (cur.isBefore(endDate)) {
            slots.add(cur);
            cur = cur.plusMinutes(15);
        }
        return slots;
    }
}
