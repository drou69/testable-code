package com.codexp.hardtotest.exercice5;

import com.codexp.hardtotest.SlowService;

public final class OrderService {

    public final String charge(double amount) {
        return new SlowService().call("Charging " + amount);
    }
}
