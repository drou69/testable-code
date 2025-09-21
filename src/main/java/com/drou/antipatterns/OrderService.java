package com.drou.antipatterns;

public final class OrderService {
    public final String charge(double amount) {
        return new SlowService().call("Charging " + amount);
    }
}
