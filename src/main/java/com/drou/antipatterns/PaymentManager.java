package com.drou.antipatterns;

public class PaymentManager {
    public String charge(String order) {
        return PaymentServiceSingleton.getInstance().doWork(order);
    }
}
