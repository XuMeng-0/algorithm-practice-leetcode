package com.github.xumeng.java.problems.easy.problem0338;

public class Solution0338 {

    public int[] countBits(int n) {
        int arrayLength = n + 1;
        int[] result = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            result[i] = countNumberOfOne(i);
        }
        return result;
    }

    private int countNumberOfOne(int n) {
        int quotient;
        int countOfOne = 0;
        while (n != 0) {
            quotient = n / 2;
            if (n % 2 == 1) {
                countOfOne++;
            }
            n = quotient;
        }
        return countOfOne;
    }

}
