package com.github.xumeng.java.problems.medium.problem0078;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0078Test {

    private final Solution0078 solution = new Solution0078();

    @Test
    public void test1() {
        int[] nums = {0};
        List<List<Integer>> subsets = solution.subsets(nums);
        List<Integer> subset1 = List.of();
        List<Integer> subset2 = List.of(0);
        List<List<Integer>> expected = List.of(subset1, subset2);
        assertListEquals(expected, subsets);
    }

    @Test
    public void test2() {
        int[] nums = {1, 2};
        List<List<Integer>> subsets = solution.subsets(nums);
        List<Integer> subset1 = List.of();
        List<Integer> subset2 = List.of(1);
        List<Integer> subset3 = List.of(2);
        List<Integer> subset4 = List.of(1, 2);
        List<List<Integer>> expected = List.of(subset1, subset2, subset3, subset4);
        assertListEquals(expected, subsets);
    }

    @Test
    public void test3() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);
        List<Integer> subset1 = List.of();
        List<Integer> subset2 = List.of(1);
        List<Integer> subset3 = List.of(2);
        List<Integer> subset4 = List.of(3);
        List<Integer> subset5 = List.of(1, 2);
        List<Integer> subset6 = List.of(1, 3);
        List<Integer> subset7 = List.of(2, 3);
        List<Integer> subset8 = List.of(1, 2, 3);
        List<List<Integer>> expected = List.of(subset1, subset2, subset3, subset4, subset5, subset6, subset7, subset8);
        assertListEquals(expected, subsets);
    }

    @Test
    public void test4() {
        int[] nums = {-1, 2, 4};
        List<List<Integer>> subsets = solution.subsets(nums);
        List<Integer> subset1 = List.of();
        List<Integer> subset2 = List.of(-1);
        List<Integer> subset3 = List.of(2);
        List<Integer> subset4 = List.of(4);
        List<Integer> subset5 = List.of(-1, 2);
        List<Integer> subset6 = List.of(-1, 4);
        List<Integer> subset7 = List.of(2, 4);
        List<Integer> subset8 = List.of(-1, 2, 4);
        List<List<Integer>> expected = List.of(subset1, subset2, subset3, subset4, subset5, subset6, subset7, subset8);
        assertListEquals(expected, subsets);
    }

    private void assertListEquals(List<List<Integer>> expected, List<List<Integer>> subsets) {
        assertEquals(expected.size(), subsets.size());
        Integer[] array = new Integer[0];
        for (int i = 0; i < expected.size(); i++) {
            List<Integer> e1 = expected.get(i);
            List<Integer> s1 = subsets.get(i);
            assertArrayEquals(e1.toArray(array), s1.toArray(array));
        }
    }

}