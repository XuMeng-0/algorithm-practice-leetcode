package com.github.xumeng.java.problems.easy.problem0258;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0258Test {

    private final Solution0258 solution = new Solution0258();

    @Test
    public void test1() {
        int num = 38;
        int sum = solution.addDigits(num);
        assertEquals(2, sum);
    }

    @Test
    public void test2() {
        int num = 0;
        int sum = solution.addDigits(num);
        assertEquals(0, sum);
    }

    @Test
    public void test3() {
        int num = 2147483647;
        int sum = solution.addDigits(num);
        assertEquals(1, sum);
    }

}