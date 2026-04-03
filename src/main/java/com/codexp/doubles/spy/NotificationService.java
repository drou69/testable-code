package com.codexp.doubles.spy;

public class NotificationService {
    private final EmailSender sender;

    public NotificationService(EmailSender sender) {
        this.sender = sender;
    }

    public void notifyOrderPlaced(Order order) {
        sender.send(order.getCustomerEmail(), "Order placed!");
    }
}
