package com.pavanbarla.binarysearch.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLocalMaxima {

    private int localMaxima(int[] input) {
        return new LocalMaxima(input).getMaxima();
    }

    @Test
    public void test() {
        assertEquals(6, localMaxima(new int[]{2, 3, 6, 6, 4}));
        assertEquals(8, localMaxima(new int[]{2, 3, 4, 6, 8}));
        assertEquals(5, localMaxima(new int[]{5, 3, 2, 1, 0}));
        assertEquals(5, localMaxima(new int[]{5, 5, 5}));
        assertEquals(5, localMaxima(new int[]{5}));

        /**
         * In this case, both 1 and 5 are local maxima
         */
        assertTrue(5 == localMaxima(new int[]{5, 5, 5, 1, 1}) || 1 == localMaxima(new int[]{5, 5, 5, 1, 1}));
    }
}
