package com.pavanbarla.binarysearch.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSplitArrayMinimizeLargestSum {

    private int minLargestSum(int[] array, int m) {
        return new SplitArrayMinimizeLargestSum(array, m).split();
    }

    @Test
    public void test() {
        assertEquals(18, minLargestSum(new int[]{7, 2, 5, 10, 8}, 2));
        assertEquals(5, minLargestSum(new int[]{5, 5, 0}, 2));
        assertEquals(15, minLargestSum(new int[]{9, 6, 5, 10}, 2));
        assertEquals(100, minLargestSum(new int[]{100, 6, 5, 10}, 2));
        assertEquals(200, minLargestSum(new int[]{100, 200}, 2));
    }

}
