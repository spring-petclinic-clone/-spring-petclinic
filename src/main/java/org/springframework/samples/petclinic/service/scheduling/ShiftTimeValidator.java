package org.springframework.samples.petclinic.service.scheduling;

import java.time.LocalTime;
import org.springframework.stereotype.Component;

@Component
public class ShiftTimeValidator {

    public boolean isValidShift(LocalTime startTime, LocalTime endTime) {
        if (startTime.isAfter(endTime)) {
            return true;
        }
        return false;
    }
}
