package com.github.xumeng.java.problems.medium.problem0080;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0080Test {

    private final Solution0080 solution = new Solution0080();

    @Test
    public void test11() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int length = solution.removeDuplicates(nums);
        int[] expected = {1, 1, 2, 2, 3};
        assertEquals(expected.length, length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test12() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int length = solution.removeDuplicates(nums);
        int[] expected = {0, 0, 1, 1, 2, 3, 3};
        assertEquals(expected.length, length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test21() {
        int[] nums = {0};
        int length = solution.removeDuplicates(nums);
        int[] expected = {0};
        assertEquals(expected.length, length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test31() {
        int[] nums = {0, 1};
        int length = solution.removeDuplicates(nums);
        int[] expected = {0, 1};
        assertEquals(expected.length, length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test32() {
        int[] nums = {0, 0};
        int length = solution.removeDuplicates(nums);
        int[] expected = {0, 0};
        assertEquals(expected.length, length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test41() {
        int[] nums = {0, 1, 2};
        int length = solution.removeDuplicates(nums);
        int[] expected = {0, 1, 2};
        assertEquals(expected.length, length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test42() {
        int[] nums = {0, 0, 0};
        int length = solution.removeDuplicates(nums);
        int[] expected = {0, 0};
        assertEquals(expected.length, length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test51() {
        int[] nums = {0, 0, 0, 0};
        int length = solution.removeDuplicates(nums);
        int[] expected = {0, 0};
        assertEquals(expected.length, length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test52() {
        int[] nums = {0, 0, 0, 0, 1, 1, 1, 1};
        int length = solution.removeDuplicates(nums);
        int[] expected = {0, 0, 1, 1};
        assertEquals(expected.length, length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

}