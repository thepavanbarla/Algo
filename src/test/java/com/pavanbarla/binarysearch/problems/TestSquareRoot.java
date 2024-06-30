package com.pavanbarla.binarysearch.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquareRoot {

    private int sqrt(int number) {
        return new SquareRoot(number).findSqrt();
    }

    @Test
    public void test() {
        assertEquals(6, sqrt(37));
        assertEquals(31, sqrt(1000));
        assertEquals(2, sqrt(4));
        assertEquals(0, sqrt(0));
        assertEquals(1, sqrt(1));
    }
}
