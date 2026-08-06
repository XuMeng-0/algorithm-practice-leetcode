package com.github.xumeng.java.problems.easy.problem0263;

import java.util.ArrayList;
import java.util.List;

public class Solution0263 {

    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        List<Integer> factors = findPrimeFactors(n);
        for (Integer i : factors) {
            if (i > 5) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> findPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int quotient = n / i;
            int remainder = n % i;
            if (quotient < i) {
                break;
            }
            if (remainder != 0) {
                continue;
            }
            if (!factors.contains(i) && isPrime(i)) {
                factors.add(i);
            }
            if (!factors.contains(quotient) && isPrime(quotient)) {
                factors.add(quotient);
            }
        }
        return factors;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
