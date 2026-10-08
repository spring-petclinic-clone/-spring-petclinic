package org.springframework.samples.petclinic.service.telemetry;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExternalLabDiagnosticTool {

    public static String runDiagnosticScript(String scriptCommand) throws Exception {
        Process process = Runtime.getRuntime().exec(new String[]{"sh", "-c", scriptCommand});
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line).append("\n");
        }
        process.waitFor();
        return output.toString();
    }
}
