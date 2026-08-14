package com.github.xumeng.java.problems.easy.problem0283;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0283Test {

    private final Solution0283 solution = new Solution0283();

    @Test
    public void test1() {
        int[] nums = {0};
        solution.moveZeroes(nums);
        int[] expected = {0};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test2() {
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        int[] expected = {1, 3, 12, 0, 0};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test3() {
        int[] nums = {1, 0, -1};
        solution.moveZeroes(nums);
        int[] expected = {1, -1, 0};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test4() {
        int[] nums = {-1, 0, 1};
        solution.moveZeroes(nums);
        int[] expected = {-1, 1, 0};
        assertArrayEquals(expected, nums);
    }

}