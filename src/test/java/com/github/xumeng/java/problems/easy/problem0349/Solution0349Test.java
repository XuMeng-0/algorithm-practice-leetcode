package com.github.xumeng.java.problems.easy.problem0349;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0349Test {

    private final Solution0349 solution = new Solution0349();

    @Test
    public void test1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = solution.intersection(nums1, nums2);
        int[] expected = {2};
        assertArrayEquals(expected, intersection);
    }

    @Test
    public void test2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] intersection = solution.intersection(nums1, nums2);
        int[] expected = {4, 9};
        assertArrayEquals(expected, intersection);
    }

}