package com.codexp.hardtotest.exercice2;

import com.codexp.hardtotest.SlowService;

public class ConnectionManager {
    public static final String CONNECT = "connect";
    private final SlowService database;
    private final String status;

    public ConnectionManager(SlowService database) {
        this.database = database;
        status = this.database.call(CONNECT);
    }

    public boolean isConnected() {
        return status.equalsIgnoreCase("Processed: " + CONNECT);
    }
}
