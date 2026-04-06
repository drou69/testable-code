package com.codexp.fragility.maintenance.wronglevelofabstraction;

import java.util.*;

public class TagService {
    public Collection<String> getTags() {
        Set<String> tags = new TreeSet<>();

        //Set<String> tags = new HashSet<>();
        tags.add("java");
        tags.add("testing");
        tags.add("architecture");
        return tags;
    }
}
