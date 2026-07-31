package com.github.xumeng.java.problems.easy.problem0258;

public class Solution0258 {

    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        for (int i = 9, divisor; i >= 0; i--) {
            divisor = (int) Math.pow(10.0, i);
            sum += (num / divisor);
            num %= divisor;
        }
        while (sum > 9) {
            sum = addDigits(sum);
        }
        return sum;
    }

}
