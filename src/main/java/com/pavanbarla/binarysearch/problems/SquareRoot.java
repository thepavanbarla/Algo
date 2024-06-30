package com.pavanbarla.binarysearch.problems;

import com.pavanbarla.binarysearch.BinarySearch;

/**
 * Finds the square root of an unsigned integer
 */
public class SquareRoot extends BinarySearch {

    private final int input;

    public SquareRoot(int input) {
        this.input = input;
    }

    @Override
    public boolean condition(int mid) {
        return (mid * mid) > input;
    }

    public int findSqrt() {

        /**
         * TODO: Think - Can this problem be solved without the condition below?
         */
        if (input < 2)
            return input;

        int sqrt = this.execute(0, input) - 1;
        return sqrt;
    }
}
