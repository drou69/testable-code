package com.drou.hard_to_test;

public class PaymentManager {
    public String charge(String order) {
        return PaymentServiceSingleton.getInstance().doWork(order);
    }
}
