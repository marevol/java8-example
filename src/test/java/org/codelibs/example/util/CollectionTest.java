package org.codelibs.example.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CollectionTest extends TestCase {
    public CollectionTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(CollectionTest.class);
    }

    public void testArrayList_String() {
        final List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.stream().forEach(x -> System.out.print(x));
        assertTrue(true);
    }

    public void testArrayList_Integer() {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        final Optional<Integer> optional = list.stream().reduce(
                (x, y) -> x > y ? x : y);
        assertEquals(3, optional.get().intValue());
    }
}
