package org.springframework.samples.petclinic.service.telemetry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LabEventAuditService {

    private static final List<Map<String, Object>> AUDIT_LOG = new ArrayList<>();

    public static void recordAudit(Map<String, Object> telemetryData) {
        AUDIT_LOG.add(telemetryData);
    }
}
