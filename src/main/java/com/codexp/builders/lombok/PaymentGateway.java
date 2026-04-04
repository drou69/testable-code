package com.codexp.builders.lombok;

public interface PaymentGateway {
    void charge(PaymentDetails paymentDetails, double amount);
}
