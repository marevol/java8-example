package org.codelibs.example.util.function;

import java.util.function.BinaryOperator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BinaryOperatorTest extends TestCase {

    public BinaryOperatorTest(final String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(BinaryOperatorTest.class);
    }

    public void testMaxBy() {
        final BinaryOperator<Integer> func1 = BinaryOperator
                .maxBy(Integer::compare);
        assertEquals(2, func1.apply(1, 2).intValue());

        final BinaryOperator<Integer> func2 = Integer::max;
        assertEquals(2, func2.apply(1, 2).intValue());

        final BinaryOperator<Integer> func3 = Math::max;
        assertEquals(2, func3.apply(1, 2).intValue());
    }

    public void testMinBy() {
        final BinaryOperator<Integer> func1 = BinaryOperator
                .minBy(Integer::compare);
        assertEquals(1, func1.apply(1, 2).intValue());

        final BinaryOperator<Integer> func2 = Integer::min;
        assertEquals(1, func2.apply(1, 2).intValue());

        final BinaryOperator<Integer> func3 = Math::min;
        assertEquals(1, func3.apply(1, 2).intValue());
    }

}
