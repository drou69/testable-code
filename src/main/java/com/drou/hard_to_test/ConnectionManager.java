package com.drou.hard_to_test;

public class ConnectionManager {
    private final SlowService service;
    private String status;

    public ConnectionManager(SlowService service) {
        // Constructor does slow work
        this.service = service;
    }

    public void connect() {
        status = this.service.call("connect");
    }

    public boolean isConnected() {
        return status.equalsIgnoreCase("Processed: connect");
    }
}
