package org.codelibs.example.util.function;

import java.util.function.Supplier;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SupplierTest extends TestCase {

    public SupplierTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(SupplierTest.class);
    }

    public void testGet() {
        final Supplier<String> func = () -> "hoge";
        assertEquals("hoge", func.get());
    }

}
