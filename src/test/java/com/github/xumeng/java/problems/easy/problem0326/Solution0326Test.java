package com.github.xumeng.java.problems.easy.problem0326;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0326Test {

    private final Solution0326 solution = new Solution0326();

    @Test
    public void test1() {
        int n = -1;
        boolean isPowerOfThree = solution.isPowerOfThree(n);
        assertFalse(isPowerOfThree);
    }

    @Test
    public void test2() {
        int n = 0;
        boolean isPowerOfThree = solution.isPowerOfThree(n);
        assertFalse(isPowerOfThree);
    }

    @Test
    public void test3() {
        int n = 9;
        boolean isPowerOfThree = solution.isPowerOfThree(n);
        assertTrue(isPowerOfThree);
    }

    @Test
    public void test4() {
        int n = 27;
        boolean isPowerOfThree = solution.isPowerOfThree(n);
        assertTrue(isPowerOfThree);
    }

    @Test
    public void test5() {
        int n = 45;
        boolean isPowerOfThree = solution.isPowerOfThree(n);
        assertFalse(isPowerOfThree);
    }

    @Test
    public void test6() {
        int n = 2147483647;
        boolean isPowerOfThree = solution.isPowerOfThree(n);
        assertFalse(isPowerOfThree);
    }

}