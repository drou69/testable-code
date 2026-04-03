package com.codexp.hardtotest;

public class PriceManager {

    static public boolean validateAvailability() {

        return new SlowService().call("In Stock?") != null;
    }

    static public boolean validateTrue(){
        //do something harmless
        return true;
    }
}