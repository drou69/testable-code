package com.codexp.builders;

public interface PaymentGateway {
    void charge(PaymentDetails paymentDetails, double amount);
}
