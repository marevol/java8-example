package org.codelibs.example.util.function;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ToXFunctionTest extends TestCase {

    public ToXFunctionTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ToXFunctionTest.class);
    }

    public void testApplyAsInt() {
        final ToIntFunction<String> func = s -> s.length();
        assertEquals(3, func.applyAsInt("aaa"));
    }

    public void testApplyAsLong() {
        final ToLongFunction<String> func = s -> s.length();
        assertEquals(3, func.applyAsLong("aaa"));
    }

    public void testApplyAsDouble() {
        final ToDoubleFunction<String> func = s -> Double.parseDouble(s);
        assertEquals(3.0, func.applyAsDouble("3.0"));
    }

}
