package com.codexp.hardtotest.exercice7;

public class MommyDoll extends GrandmaDoll {
    @Override
    public String hug(String input) {
        return super.hug("Mommy hugs ") + input;
    }
}