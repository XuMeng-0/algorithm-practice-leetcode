package com.github.xumeng.java.problems.medium.problem0075;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0075Test {

    private final Solution0075S1 solution = new Solution0075S1();


    @Test
    public void test1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        int[] expected = {0, 0, 1, 1, 2, 2};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test2() {
        int[] nums = {2, 0, 1};
        solution.sortColors(nums);
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test3() {
        int[] nums = {0};
        solution.sortColors(nums);
        int[] expected = {0};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test4() {
        int[] nums = {0, 1};
        solution.sortColors(nums);
        int[] expected = {0, 1};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test5() {
        int[] nums = {0, 2};
        solution.sortColors(nums);
        int[] expected = {0, 2};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test6() {
        int[] nums = {1, 2};
        solution.sortColors(nums);
        int[] expected = {1, 2};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test7() {
        int[] nums = {1, 0};
        solution.sortColors(nums);
        int[] expected = {0, 1};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test8() {
        int[] nums = {2, 0};
        solution.sortColors(nums);
        int[] expected = {0, 2};
        assertArrayEquals(expected, nums);
    }

    @Test
    public void test9() {
        int[] nums = {2, 1};
        solution.sortColors(nums);
        int[] expected = {1, 2};
        assertArrayEquals(expected, nums);
    }

}