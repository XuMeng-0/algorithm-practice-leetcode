package com.github.xumeng.java.problems.easy.problem0231;

public class Solution0231S1 {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        for (int i = 0; i < 32; i++) {
            double power = Math.pow(2, i);
            if (power == n) {
                return true;
            }
            if (power > n) {
                return false;
            }
        }
        return false;
    }

}
