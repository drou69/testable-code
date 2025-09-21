package com.drou.antipatterns;

public class CustomerOrder {

    public String process(Customer customer) {
        // Chained + slow
        return customer.getOrder().getPayment().getSlowService().call("customer");
    }

    public static class Customer {
        Order getOrder() { return new Order(); }
    }
    static class Order {
        Payment getPayment() { return new Payment(); }
    }
    static class Payment {
        SlowService getSlowService() { return new SlowService(); }
    }
}
