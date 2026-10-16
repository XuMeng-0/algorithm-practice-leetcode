package com.github.xumeng.java.problems.easy.problem0367;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0367Test {

    private final Solution0367 solution = new Solution0367();

    @Test
    public void test1() {
        int num = 1;
        boolean isPerfectSquare = solution.isPerfectSquare(num);
        assertTrue(isPerfectSquare);
    }

    @Test
    public void test2() {
        int num = 2;
        boolean isPerfectSquare = solution.isPerfectSquare(num);
        assertFalse(isPerfectSquare);
    }

    @Test
    public void test3() {
        int num = 14;
        boolean isPerfectSquare = solution.isPerfectSquare(num);
        assertFalse(isPerfectSquare);
    }

    @Test
    public void test4() {
        int num = 16;
        boolean isPerfectSquare = solution.isPerfectSquare(num);
        assertTrue(isPerfectSquare);
    }

    @Test
    public void test5() {
        int num = 2147483647;
        boolean isPerfectSquare = solution.isPerfectSquare(num);
        assertFalse(isPerfectSquare);
    }

}