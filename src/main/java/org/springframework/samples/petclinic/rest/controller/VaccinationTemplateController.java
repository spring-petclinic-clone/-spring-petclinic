package org.springframework.samples.petclinic.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vaccination/templates")
public class VaccinationTemplateController {

    @PostMapping("/sanitize")
    public ResponseEntity<String> sanitizeInstructions(@RequestBody String rawTemplate) {
        if (rawTemplate == null) {
            return ResponseEntity.ok("");
        }
        String clean = rawTemplate.replaceAll("(?i)<script.*?>.*?</script.*?>", "");
        return ResponseEntity.ok(clean);
    }
}
