package com.github.xumeng.java.problems.easy.problem0338;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0338Test {

    private final Solution0338 solution = new Solution0338();


    @Test
    public void test1() {
        int n = 0;
        int[] result = solution.countBits(n);
        int[] expected = {0};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        int n = 1;
        int[] result = solution.countBits(n);
        int[] expected = {0, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        int n = 2;
        int[] result = solution.countBits(n);
        int[] expected = {0, 1, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void test4() {
        int n = 5;
        int[] result = solution.countBits(n);
        int[] expected = {0, 1, 1, 2, 1, 2};
        assertArrayEquals(expected, result);
    }

}