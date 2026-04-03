package com.codexp.doubles.dummy;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OrderServiceTest {

    //Dummies for values are most of the tine a code smell (i.e. bad design)
    //Dummies are mostly used purposefully for crosscutting concerns that are beyond
    // what we are testing and we don't care about what they do or return at the moment.
    @Test
    public void should_be_able_to_calculate_total_for_many_items(){
        AuditService dummyAudit = new DummyAuditService();
        OrderService service = new OrderService(dummyAudit);

        Order order = new Order(List.of(new Item(1,8.0), new Item(2,20.0)));

        double total = service.calculateTotal(order);

        assertEquals(28.0, total);
    }
}
