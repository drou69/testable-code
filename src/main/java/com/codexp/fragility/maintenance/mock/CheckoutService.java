package com.codexp.fragility.maintenance.mock;

public class CheckoutService {
    private final PaymentGateway gateway;

    public CheckoutService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void checkout(double total) {
        // What would happen to our test if were to change the way I process payment?
        // Let's say we cannot process more than 500$ by call?

        gateway.process(total);
    }
}
/*
double remaingingPayment = total;
double limitPerProcessing = 500.0;
boolean wasProcessingSuccessful = true;

        while(wasProcessingSuccessful && remaingingPayment > 0){
        if(remaingingPayment >= limitPerProcessing){
wasProcessingSuccessful = gateway.process(limitPerProcessing);
remaingingPayment -= limitPerProcessing;
            } else {
wasProcessingSuccessful = gateway.process(remaingingPayment);
            }
                    }*/