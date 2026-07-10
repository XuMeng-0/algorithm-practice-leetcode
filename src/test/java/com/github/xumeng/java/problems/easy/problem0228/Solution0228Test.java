package com.github.xumeng.java.problems.easy.problem0228;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0228Test {

    private final Solution0228 solution = new Solution0228();

    @Test
    public void test1() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = solution.summaryRanges(nums);
        List<String> expected = new ArrayList<>();
        expected.add("0->2");
        expected.add("4->5");
        expected.add("7");
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void test2() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> result = solution.summaryRanges(nums);
        List<String> expected = new ArrayList<>();
        expected.add("0");
        expected.add("2->4");
        expected.add("6");
        expected.add("8->9");
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void test3() {
        int[] nums = {};
        List<String> result = solution.summaryRanges(nums);
        assertArrayEquals(new ArrayList<>().toArray(), result.toArray());
    }

    @Test
    public void test4() {
        int[] nums = {1};
        List<String> result = solution.summaryRanges(nums);
        List<String> expected = new ArrayList<>();
        expected.add("1");
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void test5() {
        int[] nums = {0, 1, 2, 3, 4, 5};
        List<String> result = solution.summaryRanges(nums);
        List<String> expected = new ArrayList<>();
        expected.add("0->5");
        assertArrayEquals(expected.toArray(), result.toArray());
    }

}