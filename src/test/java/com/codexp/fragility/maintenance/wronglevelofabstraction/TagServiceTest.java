package com.codexp.fragility.maintenance.wronglevelofabstraction;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TagServiceTest {
    @Test
    void testGetTags_Brittle() {
        TagService service = new TagService();
        Collection<String> result = service.getTags("some content");

        List<String> resultList = new ArrayList<>(result);

        assertEquals("architecture", resultList.get(0));
        assertEquals("java", resultList.get(1));
    }
//This is a way to make it more robust.  Is it the right way?  It all depends on what behavior we want to protect against change.
//Unit tests should only fail when the behavior has changed (whether it's voluntary or not)
    @Test
    void testGetTags_Robust() {
        TagService service = new TagService();
        Collection<String> result = service.getTags("some content");

        assertEquals(3, result.size());
        assertTrue(result.containsAll(List.of("java", "testing", "architecture")));
    }
}