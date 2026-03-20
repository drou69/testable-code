package com.drou.building_dsl;

import java.util.List;

public interface ShippingService {
    double calculateShipping(List<OrderItem> items, Address address);
}
