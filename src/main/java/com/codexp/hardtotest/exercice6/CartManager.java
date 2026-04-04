package com.codexp.hardtotest.exercice6;

public class CartManager {
    //we are searching through the object tree the things we need instead of asking for it.
    //Do we need to know about Customer... at all?
    //What about Order?  It is very likely to change sooner or later to remove its unhealthy relationship with PaymentService, which will affect this class...
    //Other than binding ourselves to unwanted dependencies, how this situation augment complexity doing unit testing? (Arrange phase for instance)
    //Here, most of our calls are accessor... what if we had more logic call chained like processTransaction?
    //Do you see any other problems with chaining like that?
    public String process(Customer customer) {
        return customer.getOrder().getPayment().processTransaction(customer.getOrder().getItem().getPrice());
    }
}
