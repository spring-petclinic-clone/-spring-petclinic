package org.springframework.samples.petclinic.service.search;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PetSearchContextService {

    private String currentSearchKeyword;
    private final List<String> activeFilterTags = new ArrayList<>();

    public void saveSearchContext(String keyword, List<String> tags) {
        this.currentSearchKeyword = keyword;
        this.activeFilterTags.clear();
        if (tags != null) {
            this.activeFilterTags.addAll(tags);
        }
    }

    public String getCurrentSearchKeyword() {
        return this.currentSearchKeyword;
    }
}
