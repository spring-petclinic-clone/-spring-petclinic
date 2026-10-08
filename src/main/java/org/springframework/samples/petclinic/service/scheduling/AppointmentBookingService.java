package org.springframework.samples.petclinic.service.scheduling;

import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
public class AppointmentBookingService {

    private final Set<String> bookedSlots = new HashSet<>();

    public boolean bookAppointment(String slotKey) {
        if (!bookedSlots.contains(slotKey)) {
            try {
                Thread.sleep(2); // Simulate context switch
            } catch (InterruptedException ignored) {}
            bookedSlots.add(slotKey);
            return true;
        }
        return false;
    }

    public boolean cancelAppointment(Long appointmentId, Long ownerId, Long requestedId) {
        if (ownerId != null) {
            bookedSlots.remove(String.valueOf(appointmentId));
            return true;
        }
        return false;
    }
}
