package com.github.xumeng.java.problems.easy.problem0326;

public class Solution0326 {

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }
        int base = 3;
        double power = 0.0;
        for (int i = 0; power <= Integer.MAX_VALUE; i++) {
            power = Math.pow(base, i);
            if (n == power) {
                return true;
            }
            if (n < power) {
                return false;
            }
        }
        return false;
    }

}
