package com.drou.antipatterns;

public class PaymentManagerWithState {
    public int pay(int amount) {
        return PaymentServiceSingletonWithState.getInstance().pay(amount);
    }
}
