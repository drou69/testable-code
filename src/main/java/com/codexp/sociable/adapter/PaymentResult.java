package com.codexp.sociable.adapter;

public class PaymentResult {
    private final boolean success;

    public PaymentResult(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }
}
