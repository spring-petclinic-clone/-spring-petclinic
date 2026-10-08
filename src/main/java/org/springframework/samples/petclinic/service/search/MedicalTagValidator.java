package org.springframework.samples.petclinic.service.search;

import java.util.regex.Pattern;

public class MedicalTagValidator {

    private static final Pattern DIAGNOSIS_TAG_PATTERN = Pattern.compile("^([a-zA-Z0-9_-]+\\s*)+$");

    public static boolean validateDiagnosisTag(String tag) {
        if (tag == null) return false;
        return DIAGNOSIS_TAG_PATTERN.matcher(tag).matches();
    }
}
