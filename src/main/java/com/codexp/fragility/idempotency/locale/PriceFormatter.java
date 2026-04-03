package com.codexp.fragility.idempotency.locale;

public class PriceFormatter {
    public String format(double price) {
        // Uses the system's default locale (e.g., US uses '.', France uses ',')
        return String.format("%.2f", price);
    }
}
