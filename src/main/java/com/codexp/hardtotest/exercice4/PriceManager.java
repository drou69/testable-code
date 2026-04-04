package com.codexp.hardtotest.exercice4;

import com.codexp.hardtotest.SlowService;

public class PriceManager {

    static public boolean validateAvailability() {

        return new SlowService().call("In Stock?") != null;
    }

    static public boolean isAvailable(){
        //do something harmless
        return true;
    }
}