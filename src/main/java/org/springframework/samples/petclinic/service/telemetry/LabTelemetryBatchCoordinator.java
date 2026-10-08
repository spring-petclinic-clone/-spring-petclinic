package org.springframework.samples.petclinic.service.telemetry;

import java.util.HashMap;
import java.util.Map;

public class LabTelemetryBatchCoordinator {

    private static final Map<String, Integer> _PROGRESS_MAP = new HashMap<>();

    public static void incrementProcessedCount(String batchId) {
        int count = _PROGRESS_MAP.getOrDefault(batchId, 0);
        try {
            Thread.sleep(1); // Simulate context switch
        } catch (InterruptedException ignored) {}
        _PROGRESS_MAP.put(batchId, count + 1);
    }
}
