package com.codexp.fragility.idempotency.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BingoMachine {
    private List<String> balls;
    private Random ballPicker;

    public BingoMachine() {
        this.balls = List.of("A1","B1","C1","D1","E1");
        this.ballPicker = new Random();
    }

    public String draw(){
        return balls.get(ballPicker.nextInt(5));
    }
}
