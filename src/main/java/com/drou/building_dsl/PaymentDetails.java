package com.drou.building_dsl;

public class PaymentDetails {
    private final String cardNumber;
    private final String cardHolder;
    private final String expiry;

    public PaymentDetails(String cardNumber, String cardHolder, String expiry) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiry = expiry;
    }
}
