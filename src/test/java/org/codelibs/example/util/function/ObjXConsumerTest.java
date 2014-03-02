package org.codelibs.example.util.function;

import java.util.function.ObjIntConsumer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ObjXConsumerTest extends TestCase {

    public ObjXConsumerTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ObjXConsumerTest.class);
    }

    public void testApplyAsInt() {
        final ObjIntConsumer<String> func = (s, idx) -> assertEquals(idx,
                Integer.parseInt(s));
        func.accept("1", 1);
    }

}
