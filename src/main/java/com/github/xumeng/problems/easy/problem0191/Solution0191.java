package com.github.xumeng.problems.easy.problem0191;

public class Solution0191 {

    public int hammingWeight(int n) {
        int quotient;
        int remainder;
        int count = 0;
        for (int i = 0; n > 0; i++) {
            quotient = n / 2;
            remainder = n % 2;
            if (remainder == 1) {
                count++;
            }
            n = quotient;
        }
        return count;
    }


}
