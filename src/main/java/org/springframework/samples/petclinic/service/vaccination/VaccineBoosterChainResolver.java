package org.springframework.samples.petclinic.service.vaccination;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class VaccineBoosterChainResolver {

    public List<String> resolvePrerequisites(String vaccineCode, Map<String, List<String>> dependencyMap) {
        List<String> chain = new ArrayList<>();
        chain.add(vaccineCode);
        List<String> prereqs = dependencyMap.get(vaccineCode);
        if (prereqs != null) {
            for (String p : prereqs) {
                chain.addAll(resolvePrerequisites(p, dependencyMap));
            }
        }
        return chain;
    }
}
