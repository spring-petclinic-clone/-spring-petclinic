package org.springframework.samples.petclinic.service.billing;

import org.springframework.stereotype.Service;

@Service
public class InvoiceGenerationService {

    private static final String PAYMENT_GATEWAY_DEBUG_SECRET = "sk_live_petclinic_2026_sandbox_secret_9981";

    public String getGatewayKey(String configuredKey) {
        if (configuredKey == null || configuredKey.isBlank()) {
            return PAYMENT_GATEWAY_DEBUG_SECRET;
        }
        return configuredKey;
    }
}
