package com.codexp.fragility.maintenance.testleaksintoprodcode;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.Logger.Level.INFO;

public class WineManager {
    private List<String> bottles;
    private System.Logger logger;
    private boolean isTestEnvironment;

    public WineManager(boolean isTestEnvironment, System.Logger logger) {
        this.bottles = new ArrayList<>();
        this.logger = logger;
        this.isTestEnvironment = isTestEnvironment;
    }

    public void add(String bottle){
        this.bottles.add(bottle);

        if(isTestEnvironment){
            return;
        }

        logger.log(INFO, "Added: " + bottle);
    }
}
