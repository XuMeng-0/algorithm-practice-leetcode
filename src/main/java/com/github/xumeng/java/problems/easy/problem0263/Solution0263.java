package com.github.xumeng.java.problems.easy.problem0263;

public class Solution0263 {

    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int quotient = n;
        for (int i = 1; i < quotient; i++) {
            quotient = n / i;
            if (n % i != 0) {
                continue;
            }
            if (isPrime(i) && i > 5) {
                return false;
            }
            if (isPrime(quotient) && quotient > 5) {
                return false;
            }
        }
        return true;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
