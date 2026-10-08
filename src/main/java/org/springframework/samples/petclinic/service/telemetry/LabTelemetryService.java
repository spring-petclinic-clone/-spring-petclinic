package org.springframework.samples.petclinic.service.telemetry;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LabTelemetryService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Async
    public void dispatchLabResults(String externalEndpoint, String payload) {
        restTemplate.postForEntity(externalEndpoint, payload, String.class);
    }
}
