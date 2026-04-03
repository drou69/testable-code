package com.codexp.fragility.maintenance.wronglevelofabstraction;

import java.util.*;

public class TagService {
    public Collection<String> getTags(String content) {
        // Implementation detail: Using TreeSet to keep things alphabetical
        Set<String> tags = new TreeSet<>();

        //Set<String> tags = new HashSet<>();
        tags.add("java");
        tags.add("testing");
        tags.add("architecture");
        return tags;
    }
}
