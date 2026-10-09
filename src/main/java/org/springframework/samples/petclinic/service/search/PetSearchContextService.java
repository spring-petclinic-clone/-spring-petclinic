package org.springframework.samples.petclinic.service.search;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class PetSearchContextService {

    private Map<String, Object> currentSearchContext = new HashMap<>();

    public void saveSearchContext(String key, Object value) {
        this.currentSearchContext.put(key, value);
    }

    public Object getSearchContext(String key) {
        return this.currentSearchContext.get(key);
    }
}
