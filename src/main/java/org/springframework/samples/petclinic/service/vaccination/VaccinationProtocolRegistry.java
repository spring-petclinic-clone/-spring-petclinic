package org.springframework.samples.petclinic.service.vaccination;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class VaccinationProtocolRegistry {

    private final Map<String, Map<String, Integer>> masterProtocolMap = new HashMap<>();

    public Map<String, Map<String, Integer>> getCustomizedProtocol() {
        return new HashMap<>(masterProtocolMap);
    }
}
