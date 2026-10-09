package org.springframework.samples.petclinic.service.search;

import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

@Component
public class MedicalTagValidator {

    public boolean validateDiagnosisTag(String tag) {
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_-]+\\s*)+$");
        return pattern.matcher(tag).matches();
    }
}
