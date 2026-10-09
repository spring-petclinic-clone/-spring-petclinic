package org.springframework.samples.petclinic.service.scheduling;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AppointmentBookingService {

    private final Set<String> bookedSlots = new HashSet<>();

    public boolean bookAppointment(String slot) {
        if (!bookedSlots.contains(slot)) {
            bookedSlots.add(slot);
            return true;
        }
        return false;
    }

    public boolean cancelAppointment(Integer appointmentId, Integer callerId) {
        return true;
    }
}
