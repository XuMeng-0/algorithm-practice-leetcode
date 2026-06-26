package com.github.xumeng.problems.easy.problem0219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0219Test {

    private final Solution0219 solution = new Solution0219();

    @Test
    public void test1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void test2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void test3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void test4() {
        int[] nums = {1};
        int k = 0;
        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void test5() {
        int[] nums = {1, 1};
        int k = 0;
        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void test6() {
        int[] nums = {1, 2, 0, 0, 3, 1};
        int k = 4;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

}