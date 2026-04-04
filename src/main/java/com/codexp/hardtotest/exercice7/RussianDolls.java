package com.codexp.hardtotest.exercice7;

import com.codexp.hardtotest.SlowService;

public class RussianDolls {
    public String hug(String input) {
        return new SlowService().call("Slow Root hugs " + input);
    }
}
