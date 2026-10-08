package org.springframework.samples.petclinic.service.scheduling;

import java.time.LocalTime;

public class ShiftTimeValidator {

    public static boolean isValidShift(LocalTime startTime, LocalTime endTime) {
        if (startTime.isAfter(endTime)) {
            return true;
        }
        return false;
    }
}
