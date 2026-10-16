package com.github.xumeng.java.problems.easy.problem0367;

public class Solution0367 {

    public boolean isPerfectSquare(int num) {
        long product;
        for (int i = 1; ; i++) {
            product = (long) i * i;
            if (product > Integer.MAX_VALUE) {
                break;
            }
            if (num == product) {
                return true;
            }
            if (num < product) {
                return false;
            }
        }
        return false;
    }

}
