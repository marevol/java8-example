package org.codelibs.example.util.function;

import java.util.function.Predicate;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class PredicateTest extends TestCase {

    public PredicateTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(PredicateTest.class);
    }

    public void testTest() {
        final Predicate<String> func = s -> s.isEmpty();
        assertTrue(func.test(""));
        assertFalse(func.test("hoge"));
    }

    public void testIsEqual() {
        final Predicate<String> func = Predicate.isEqual("hoge");
        assertFalse(func.test(""));
        assertTrue(func.test("hoge"));
    }

    public void testAnd() {
        final Predicate<String> func1 = s -> s != null;
        final Predicate<String> func2 = s -> !s.isEmpty();
        assertFalse(func1.and(func2).test(null));
        assertFalse(func1.and(func2).test(""));
        assertTrue(func1.and(func2).test("hoge"));
    }

    public void testOr() {
        final Predicate<String> func1 = s -> s == null;
        final Predicate<String> func2 = s -> s.isEmpty();
        // depend on the order...
        assertTrue(func1.or(func2).test(null));
        assertTrue(func1.or(func2).test(""));
        assertFalse(func1.or(func2).test("hoge"));
    }

    public void testNegate() {
        final Predicate<String> func = s -> s.isEmpty();
        assertFalse(func.negate().test(""));
        assertTrue(func.negate().test("hoge"));
    }
}
