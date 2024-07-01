package com.pavanbarla.binarysearch.problems;

import com.pavanbarla.binarysearch.BinarySearch;

import java.util.Arrays;

/**
 * Given an array which consists of non-negative integers and an integer m,
 * you can split the array into m non-empty continuous sub-arrays.
 * This class implements an algorithm to minimize the largest sum among
 * these m sub-arrays using binary search.
 */
public class SplitArrayMinimizeLargestSum extends BinarySearch {

    private final int[] array;
    private final int m;

    public SplitArrayMinimizeLargestSum(int[] input, int m) {
        this.array = input;
        this.m = m;
    }

    /**
     * Checks if the array could be split into m sub-arrays where
     * the largest sum of any sub-array is less than or equal to mid
     * (Here, mid belongs to the answer space)
     *
     * @param mid of the binary search algorithm
     * @return if the split is possible
     */
    @Override
    public boolean condition(int mid) {
        int index = 0;
        int subArraySum = 0;
        int numberOfSubArrays = 0;

        while (index < array.length) {
            if (array[index] > mid)
                return false;

            if (subArraySum + array[index] > mid) {
                numberOfSubArrays++;
                subArraySum = 0;
            }
            subArraySum += array[index];
            index++;
        }
        return numberOfSubArrays + 1 <= m;
    }

    public int split() {
        int right = Arrays.stream(array).sum();
        int left = right / m;
        return super.execute(left, right);
    }
}
