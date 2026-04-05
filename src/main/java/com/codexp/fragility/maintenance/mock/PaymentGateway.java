package com.codexp.fragility.maintenance.mock;

public interface PaymentGateway {
    boolean process(double amount);
}
