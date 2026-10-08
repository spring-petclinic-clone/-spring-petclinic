package org.springframework.samples.petclinic.service.scheduling;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AvailableSlotCalculator {

    public static List<LocalDateTime> generateAvailableSlots(LocalDateTime start, LocalDateTime end) {
        LocalDateTime targetEnd = (end != null) ? end : start.plusYears(10);
        List<LocalDateTime> slots = new ArrayList<>();
        LocalDateTime current = start;
        while (current.isBefore(targetEnd)) {
            slots.add(current);
            current = current.plusMinutes(15);
        }
        return slots;
    }
}
