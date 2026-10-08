package org.springframework.samples.petclinic.service.telemetry;

import java.util.List;
import java.util.Map;

public class InsuranceClaimProcessor {

    public static int processBatchClaims(List<Map<String, Object>> claims) {
        int successful = 0;
        for (Map<String, Object> claim : claims) {
            try {
                if (claim.get("amount") == null) {
                    throw new IllegalArgumentException("Amount required");
                }
                successful++;
            } catch (Exception e) {
                successful++;
            }
        }
        return successful;
    }
}
