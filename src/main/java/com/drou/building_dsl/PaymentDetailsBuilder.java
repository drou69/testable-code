package com.drou.building_dsl;

public class PaymentDetailsBuilder {
    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private static PaymentDetailsBuilder builder;

    private PaymentDetailsBuilder(){
    }

    public static PaymentDetailsBuilder createPaymentDetails(){
        builder = new PaymentDetailsBuilder();
        return builder;
    }

    public PaymentDetailsBuilder withCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
        return builder;
    }

    public PaymentDetailsBuilder withCardHolder(String cardHolder){
        this.cardHolder = cardHolder;
        return builder;
    }

    public PaymentDetailsBuilder withExpiry(String expiry){
        this.expiry = expiry;
        return builder;
    }

    public PaymentDetails build(){
        return new PaymentDetails(cardNumber, cardHolder, expiry);
    }
}
