package com.pavanbarla.binarysearch.problems;

import com.pavanbarla.binarysearch.BinarySearch;

/**
 * Find any local maxima in sn unsorted array
 */
public class LocalMaxima extends BinarySearch {

    private final int[] array;

    public LocalMaxima(int[] input) {
        this.array = input;
    }

    @Override
    public boolean condition(int mid) {
        return (mid > 0 && array[mid - 1] >= array[mid])
                || (mid == 0 && array[mid + 1] <= array[mid]);
    }

    public int getMaxima() {
        int maximaIndex = super.execute(0, array.length - 1);
        return array[maximaIndex];
    }
}
