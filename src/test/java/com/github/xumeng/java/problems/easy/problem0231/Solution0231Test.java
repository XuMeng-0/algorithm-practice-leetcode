package com.github.xumeng.java.problems.easy.problem0231;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0231Test {

    //    private final Solution0231S1 solution = new Solution0231S1();
    private final Solution0231S2 solution = new Solution0231S2();

    @Test
    public void test1() {
        int n = 1;
        boolean result = solution.isPowerOfTwo(n);
        assertTrue(result);
    }

    @Test
    public void test2() {
        int n = 3;
        boolean result = solution.isPowerOfTwo(n);
        assertFalse(result);
    }

    @Test
    public void test3() {
        int n = 16;
        boolean result = solution.isPowerOfTwo(n);
        assertTrue(result);
    }

    @Test
    public void test4() {
        int n = 0;
        boolean result = solution.isPowerOfTwo(n);
        assertFalse(result);
    }

    @Test
    public void test5() {
        int n = -1;
        boolean result = solution.isPowerOfTwo(n);
        assertFalse(result);
    }

}