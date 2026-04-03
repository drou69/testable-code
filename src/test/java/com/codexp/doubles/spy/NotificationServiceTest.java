package com.codexp.doubles.spy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotificationServiceTest {
    @Test
    void shouldSendEmailOnOrderPlaced() {
        SpyEmailSender spySender = new SpyEmailSender();
        NotificationService service = new NotificationService(spySender);

        Order order = new Order("customer@example.com");
        service.notifyOrderPlaced(order);

        assertEquals(1, spySender.emails.size());
        assertEquals("customer@example.com", spySender.emails.get(0));
        assertEquals("Order placed!", spySender.messages.get(0));
    }
}
