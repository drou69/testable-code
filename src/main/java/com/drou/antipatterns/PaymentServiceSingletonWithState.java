package com.drou.antipatterns;

public class PaymentServiceSingletonWithState {
    private static final PaymentServiceSingletonWithState INSTANCE = new PaymentServiceSingletonWithState();
    private int total;

    private PaymentServiceSingletonWithState() {}

    public static PaymentServiceSingletonWithState getInstance() {
        return INSTANCE;
    }

    public int pay(int amount) {
        return total += amount;
    }
}
