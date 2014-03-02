package org.codelibs.example.util.function;

import java.util.function.Consumer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ConsumerTest extends TestCase {

    public ConsumerTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ConsumerTest.class);
    }

    public void testAccept() {
        final Consumer<String> func = s -> assertEquals("hoge", s);
        func.accept("hoge");
    }

    public void testAndThenAccept() {
        final Consumer<String> func1 = s -> assertEquals("hoge", s);
        final Consumer<String> func2 = s -> assertEquals("hoge", s);
        func1.andThen(func2).accept("hoge");
    }

}
