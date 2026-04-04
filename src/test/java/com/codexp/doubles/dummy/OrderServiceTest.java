package com.codexp.doubles.dummy;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OrderServiceTest {

    // When Dummies are used for values, most of the time, it indicates a code smell (i.e. bad design)
    // Dummies are mostly used purposefully for crosscutting concerns that are beyond the scope of what
    // we are testing (i.e. logging)
    @Test
    public void should_be_able_to_calculate_total_for_many_items(){
        AuditService dummyAudit = new DummyAuditService();
        OrderService service = new OrderService(dummyAudit);

        Order order = new Order(List.of(new Item(1,8.0), new Item(2,20.0)));

        double total = service.calculateTotal(order);

        assertEquals(28.0, total);
    }
}
