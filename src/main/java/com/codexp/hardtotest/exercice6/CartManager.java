package com.codexp.hardtotest.exercice6;

public class CartManager {
    //Do we need to know about all these dependencies that we are accidentally inviting to the party?
    //hwo does chaining affect the AAA of unit testing?
    //Accessor chains vs Execution chains
    //Ask for things, don't look for them
    public String process(Customer customer) {
        return customer.getOrder().getPayment().processTransaction(customer.getOrder().getItem().getPrice());
    }
}
