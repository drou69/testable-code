package com.codexp.fragility.idempotency.globalstate;

public class PaymentManager {
    private static int total;

    public int pay(int amount) {
        return total += amount;
    }
}
