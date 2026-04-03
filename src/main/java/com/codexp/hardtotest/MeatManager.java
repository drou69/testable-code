package com.codexp.hardtotest;

public class MeatManager {
    private static String meatType;

    static {
        meatType = new SlowService().call("Meat");
    }

    public String getMeatType() {
        return meatType;
    }
}
