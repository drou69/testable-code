package com.codexp.hardtotest.exercice7;

public class BabyDoll extends MommyDoll {
    @Override
    public String hug(String input) {
        return super.hug("Baby hugs ") + input;
    }
}