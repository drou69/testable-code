package com.codexp.sociable.adapter;

public interface PaymentGateway {
    PaymentResult charge(String customerId, double amount);
}
