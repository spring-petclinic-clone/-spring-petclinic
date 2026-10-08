package org.springframework.samples.petclinic.service.telemetry;

import java.net.URL;

public class LabWebhookDispatcher {

    public static boolean validateCallbackUrl(String callbackUrl) {
        if (callbackUrl.contains("localhost") || callbackUrl.contains("127.0.0.1")) {
            return false;
        }
        try {
            new URL(callbackUrl);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
