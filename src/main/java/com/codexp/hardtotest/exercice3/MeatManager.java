package com.codexp.hardtotest.exercice3;

import com.codexp.hardtotest.SlowService;

import java.util.HashMap;
import java.util.Map;

public class MeatManager {
    private static final Map<String, String> localCache;
    private static final String BEEF = "beef";
    private static final String CHICKEN = "chicken";
    private static final String PORK = "pork";

    static {
        localCache = new HashMap<>();
        localCache.put(BEEF,new SlowService().call(BEEF));
        localCache.put(CHICKEN, new SlowService().call(CHICKEN));
        localCache.put(PORK, new SlowService().call(PORK));
    }

    public String getMeatType(String meat) {
        return localCache.get(meat);
    }
}
