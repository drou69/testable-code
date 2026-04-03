package com.codexp.fragility.maintenance.usingconcretetypes;

import java.util.ArrayList;

public class ReportGenerator {
    public ArrayList<String> generateHeaders(boolean isAdmin) {
        ArrayList<String> headers = new ArrayList<>();
        headers.add("Date");
        if (isAdmin) headers.add("Internal_ID");
        return headers;
    }
}
