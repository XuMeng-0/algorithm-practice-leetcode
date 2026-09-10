package com.github.xumeng.java.problems.easy.problem0342;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0342Test {

    private final Solution0342 solution = new Solution0342();

    @Test
    public void test1() {
        int n = -1;
        boolean isPowerOfFour = solution.isPowerOfFour(n);
        assertFalse(isPowerOfFour);
    }

    @Test
    public void test2() {
        int n = 0;
        boolean isPowerOfFour = solution.isPowerOfFour(n);
        assertFalse(isPowerOfFour);
    }

    @Test
    public void test3() {
        int n = 1;
        boolean isPowerOfFour = solution.isPowerOfFour(n);
        assertTrue(isPowerOfFour);
    }

    @Test
    public void test4() {
        int n = 5;
        boolean isPowerOfFour = solution.isPowerOfFour(n);
        assertFalse(isPowerOfFour);
    }

    @Test
    public void test5() {
        int n = 16;
        boolean isPowerOfFour = solution.isPowerOfFour(n);
        assertTrue(isPowerOfFour);
    }

    @Test
    public void test6() {
        int n = 2147483647;
        boolean isPowerOfFour = solution.isPowerOfFour(n);
        assertFalse(isPowerOfFour);
    }

}