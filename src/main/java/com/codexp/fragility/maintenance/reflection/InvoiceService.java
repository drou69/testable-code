package com.codexp.fragility.maintenance.reflection;

import java.util.List;

public class InvoiceService {

    public double totalWithTax(List<Double> items) {
        double subtotal = calculateSubtotal(items);
        return applyTax(subtotal);
    }

    /*
    Let's say we want to adopt streams as a good practice in the team.  Then, the code can be written like this:

    public double totalWithTax(List<Double> items) {
        return items.stream()
            .reduce(0.0, Double::sum) * 1.15;
    }

    Now, we are left with dead code.  Let's remove it and run the tests again.
     */

    private double calculateSubtotal(List<Double> items) {
        return items.stream().mapToDouble(Double::doubleValue).sum();
    }

    private double applyTax(double subtotal) {
        return subtotal * 1.15;
    }
}
