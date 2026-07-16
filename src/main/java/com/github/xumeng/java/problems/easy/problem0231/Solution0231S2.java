package com.github.xumeng.java.problems.easy.problem0231;

public class Solution0231S2 {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int countOfOne = 0;
        for (int quotient = n / 2; quotient > 0; n = quotient) {
            quotient = n / 2;
            if (n % 2 == 1) {
                countOfOne++;
            }
            if (countOfOne > 1) {
                return false;
            }
        }
        return true;
    }

}
