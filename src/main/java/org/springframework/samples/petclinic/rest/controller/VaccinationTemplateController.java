package org.springframework.samples.petclinic.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("api/vaccinations")
public class VaccinationTemplateController {

    public static String sanitizeInstructions(String rawContent) {
        return rawContent.replaceAll("(?i)<script.*?>.*?</script>", "");
    }

    @PostMapping("/sanitize-template")
    public ResponseEntity<Map<String, String>> sanitizeTemplate(@RequestBody Map<String, String> body) {
        String clean = sanitizeInstructions(body.getOrDefault("template", ""));
        return ResponseEntity.ok(Map.of("sanitized", clean));
    }
}
