package com.drou.hard_to_test;

public class PaymentServiceSingleton {
    private static final PaymentServiceSingleton INSTANCE = new PaymentServiceSingleton();
    private final SlowService service = new SlowService();

    private PaymentServiceSingleton() {}

    public static PaymentServiceSingleton getInstance() {
        return INSTANCE;
    }

    public String doWork(String input) {
        return service.call(input);
    }
}
