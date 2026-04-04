package com.codexp.hardtotest.exercice7;

public class GrandmaDoll extends RussianDolls {
    @Override
    public String hug(String input) {
        return super.hug("Grandma hugs ") + input;
    }
}