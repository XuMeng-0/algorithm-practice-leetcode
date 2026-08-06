package com.github.xumeng.java.problems.easy.problem0263;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0263Test {

    private final Solution0263 solution = new Solution0263();

    @Test
    public void test1() {
        boolean isUgly = solution.isUgly(-1);
        assertFalse(isUgly);
    }

    @Test
    public void test2() {
        boolean isUgly = solution.isUgly(0);
        assertFalse(isUgly);
    }

    @Test
    public void test3() {
        boolean isUgly = solution.isUgly(1);
        assertTrue(isUgly);
    }

    @Test
    public void test4() {
        boolean isUgly = solution.isUgly(6);
        assertTrue(isUgly);
    }

    @Test
    public void test5() {
        boolean isUgly = solution.isUgly(14);
        assertFalse(isUgly);
    }

    @Test
    public void test6() {
        boolean isUgly = solution.isUgly(60);
        assertTrue(isUgly);
    }

    @Test
    public void test7() {
        boolean isUgly = solution.isUgly(2147483647);
        assertFalse(isUgly);
    }

}