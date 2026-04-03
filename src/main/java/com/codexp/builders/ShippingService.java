package com.codexp.builders;

import java.util.List;

public interface ShippingService {
    double calculateShipping(List<OrderItem> items, Address address);
}
