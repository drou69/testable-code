package com.drou.building_dsl;

public interface PaymentGateway {
    void charge(PaymentDetails paymentDetails, double amount);
}
