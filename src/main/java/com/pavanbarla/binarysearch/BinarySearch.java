package com.pavanbarla.binarysearch;


/**
 * Implements the template presented at
 * https://leetcode.com/discuss/study-guide/786126/Python-Powerful-Ultimate-Binary-Search-Template.-Solved-many-problems
 */
public abstract class BinarySearch {

    public int execute(int left, int right) {
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (condition(mid))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public abstract boolean condition(int mid);

}
