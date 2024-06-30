package com.pavanbarla.binarysearch.problems;

import com.pavanbarla.binarysearch.BinarySearch;

/**
 * Finds position of the minimum index at which an item
 * can be inserted into a sorted array
 */
public class FindInsertPosition extends BinarySearch {

    /**
     * This is a sorted array
     */
    private final int[] array;
    private final int itemToInsert;

    public FindInsertPosition(int[] input, int item) {
        this.array = input;
        this.itemToInsert = item;
    }

    @Override
    public boolean condition(int mid) {
        return array[mid] >= itemToInsert;
    }

    public int findPosition() {
        int position = this.execute(0, array.length);
        return position;
    }
}
