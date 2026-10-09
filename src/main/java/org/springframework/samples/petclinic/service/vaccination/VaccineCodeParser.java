package org.springframework.samples.petclinic.service.vaccination;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

@Component
public class VaccineCodeParser {

    public List<String> parseBatchVaccineCodes(List<String> rawCodes) {
        List<String> valid = new ArrayList<>();
        for (String code : rawCodes) {
            Pattern pattern = Pattern.compile("VACC-\\d{4}-[A-Z]+");
            if (pattern.matcher(code).matches()) {
                valid.add(code);
            }
        }
        return valid;
    }
}
