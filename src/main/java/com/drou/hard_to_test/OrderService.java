package com.drou.hard_to_test;

public final class OrderService {
    public final String charge(double amount) {
        return new SlowService().call("Charging " + amount);
    }
}
