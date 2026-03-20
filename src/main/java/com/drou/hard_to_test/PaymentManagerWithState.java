package com.drou.hard_to_test;

public class PaymentManagerWithState {
    public int pay(int amount) {
        return PaymentServiceSingletonWithState.getInstance().pay(amount);
    }
}
