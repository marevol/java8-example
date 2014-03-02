package org.codelibs.example.util.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FunctionTest extends TestCase {

    public FunctionTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(FunctionTest.class);
    }

    public void testApply() {
        final Function<String, Integer> func = s -> Integer.parseInt(s);
        assertEquals(1, func.apply("1").intValue());
    }

    public void testCompose() {
        final Function<String, String> func1 = s -> "\"" + s + "\"";
        final Function<String, String> func2 = s -> "'" + s + "'";
        assertEquals("\"'hoge'\"", func1.compose(func2).apply("hoge"));
    }

    public void testAndThen() {
        final Function<String, String> func1 = s -> "\"" + s + "\"";
        final Function<String, String> func2 = s -> "'" + s + "'";
        assertEquals("'\"hoge\"'", func1.andThen(func2).apply("hoge"));
    }

    public void testIdentity() {
        final Function<String, String> func = Function.identity();
        assertEquals("hoge", func.apply("hoge"));
    }

    public void testUnaryOperator() {
        final UnaryOperator<String> func = s -> "\"" + s + "\"";
        assertEquals("\"hoge\"", func.apply("hoge"));
    }
}
