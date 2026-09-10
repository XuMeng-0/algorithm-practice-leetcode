package com.github.xumeng.java.problems.easy.problem0342;

public class Solution0342 {

    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        double powerOfFour = 0.0d;
        for (int i = 0; powerOfFour <= Integer.MAX_VALUE; i++) {
            powerOfFour = Math.pow(4, i);
            if (n == powerOfFour) {
                return true;
            }
            if (n < powerOfFour) {
                return false;
            }
        }
        return false;
    }

}
