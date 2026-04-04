package com.codexp.fragility.maintenance.wronglevelofabstraction;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TagServiceTest {

    // Here, despite using a more generic type (Collection), we can still have issues when we switch the creation in the production code.
    // Is it the wrong that it fails despite having?
    // It all depends on what behavior we want to protect against change.
    // Unit tests should only fail when the behavior has changed (whether it's voluntary or not)
    @Test
    void this_test_is_robust_for_assessing_number_of_items() {
        TagService service = new TagService();
        Collection<String> result = service.getTags();

        assertEquals(3, result.size());
    }

    @Test
    void this_test_is_robust_for_assessing_order_of_items() {
        TagService service = new TagService();
        Collection<String> result = service.getTags();

        List<String> resultList = new ArrayList<>(result);

        assertEquals(3, result.size());
        assertEquals("architecture", resultList.get(0));
        assertEquals("java", resultList.get(1));
        assertEquals("testing", resultList.get(2));
    }
}