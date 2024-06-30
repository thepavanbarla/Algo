package com.pavanbarla.binarysearch.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFindInsertPosition {

    private int findPosition(int[] input, int item) {
        return new FindInsertPosition(input, item).findPosition();
    }

    @Test
    public void test() {
        assertEquals(2, findPosition(new int[]{2, 3, 6, 6, 8}, 6));

        assertEquals(0, findPosition(new int[]{2, 3, 6, 6, 8}, 1),
                "Insert position ar the beginning of the array identified correctly");
        assertEquals(5, findPosition(new int[]{2, 3, 6, 6, 8}, 10),
                "Insert position at the end of the array identified correctly");
    }
}
