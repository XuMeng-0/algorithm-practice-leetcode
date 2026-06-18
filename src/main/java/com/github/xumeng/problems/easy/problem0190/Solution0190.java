package com.github.xumeng.problems.easy.problem0190;

public class Solution0190 {

    public int reverseBits(int n) {
        double result = 0;
        int quotient;
        byte remainder;
        for (int i = 0; n > 0; i++) {
            quotient = n / 2;
            remainder = (byte) (n % 2);
            result += remainder * Math.pow(2, 31 - i);
            n = quotient;
        }
        return (int) result;
    }

}
