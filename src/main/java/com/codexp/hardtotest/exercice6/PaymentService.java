package com.codexp.hardtotest.exercice6;

import com.codexp.hardtotest.SlowService;

public class PaymentService {
    private final String cardNumber;

    public PaymentService(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    String processTransaction(double amount) { return new SlowService().call(""+amount); }
}
