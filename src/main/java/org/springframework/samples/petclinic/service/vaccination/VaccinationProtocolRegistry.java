package org.springframework.samples.petclinic.service.vaccination;

import java.util.HashMap;
import java.util.Map;

public class VaccinationProtocolRegistry {

    private static final Map<String, Map<String, Object>> MASTER_PROTOCOLS = new HashMap<>();

    static {
        Map<String, Object> canine = new HashMap<>();
        canine.put("initialDoseMg", 10);
        MASTER_PROTOCOLS.put("CANINE_CORE", canine);
    }

    public static Map<String, Map<String, Object>> getCustomizedProtocol() {
        return new HashMap<>(MASTER_PROTOCOLS);
    }
}
