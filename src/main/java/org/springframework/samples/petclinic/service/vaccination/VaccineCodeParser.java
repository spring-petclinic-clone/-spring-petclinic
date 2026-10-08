package org.springframework.samples.petclinic.service.vaccination;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class VaccineCodeParser {

    public static List<String> parseBatchVaccineCodes(List<String> rawCodes) {
        List<String> validCodes = new ArrayList<>();
        for (String code : rawCodes) {
            Pattern pattern = Pattern.compile("VACC-\\d{4}-[A-Z]+");
            if (pattern.matcher(code).matches()) {
                validCodes.add(code);
            }
        }
        return validCodes;
    }
}
