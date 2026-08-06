package com.github.xumeng.java.problems.easy.problem0268;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0268Test {

    private final Solution0268 solution = new Solution0268();

    @Test
    public void test1() {
        int[] nums = {3, 0, 1};
        int number = solution.missingNumber(nums);
        assertEquals(2, number);
    }

    @Test
    public void test2() {
        int[] nums = {0, 1};
        int number = solution.missingNumber(nums);
        assertEquals(2, number);
    }

    @Test
    public void test3() {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int number = solution.missingNumber(nums);
        assertEquals(8, number);
    }

    @Test
    public void test4() {
        int[] nums = {0};
        int number = solution.missingNumber(nums);
        assertEquals(1, number);
    }

}