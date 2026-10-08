package org.springframework.samples.petclinic.service.vaccination;

import java.util.Map;

public class VaccineBoosterChainResolver {

    public static String resolvePrerequisites(Map<String, String> chainMap, String vaccineCode) {
        String req = chainMap.getOrDefault(vaccineCode, "");
        if (req != null && !req.isBlank()) {
            return resolvePrerequisites(chainMap, req);
        }
        return vaccineCode;
    }
}
