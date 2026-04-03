package com.codexp.doubles.spy;

import java.util.ArrayList;
import java.util.List;

public class SpyEmailSender implements EmailSender{
    public final List<String> emails = new ArrayList<>();
    public final List<String> messages = new ArrayList<>();

    @Override
    public void send(String email, String message) {
        emails.add(email);
        messages.add(message);
    }
}
