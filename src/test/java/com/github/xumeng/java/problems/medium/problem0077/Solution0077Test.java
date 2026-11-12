package com.github.xumeng.java.problems.medium.problem0077;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0077Test {

    private final Solution0077 solution = new Solution0077();

    @Test
    public void test11() {
        int n = 1;
        int k = 1;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test12() {
        int n = 2;
        int k = 1;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        expected.add(List.of(2));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test13() {
        int n = 3;
        int k = 1;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        expected.add(List.of(2));
        expected.add(List.of(3));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test22() {
        int n = 2;
        int k = 2;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test23() {
        int n = 3;
        int k = 2;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        assertListEquals(expected, combinations);
    }


    @Test
    public void test24() {
        int n = 4;
        int k = 2;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(2, 4));
        expected.add(Arrays.asList(3, 4));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test33() {
        int n = 3;
        int k = 3;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test34() {
        int n = 4;
        int k = 3;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 2, 4));
        expected.add(Arrays.asList(1, 3, 4));
        expected.add(Arrays.asList(2, 3, 4));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test35() {
        int n = 5;
        int k = 3;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 2, 4));
        expected.add(Arrays.asList(1, 3, 4));
        expected.add(Arrays.asList(2, 3, 4));
        expected.add(Arrays.asList(1, 2, 5));
        expected.add(Arrays.asList(1, 3, 5));
        expected.add(Arrays.asList(2, 3, 5));
        expected.add(Arrays.asList(1, 4, 5));
        expected.add(Arrays.asList(2, 4, 5));
        expected.add(Arrays.asList(3, 4, 5));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test44() {
        int n = 4;
        int k = 4;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3, 4));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test45() {
        int n = 5;
        int k = 4;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3, 4));
        expected.add(Arrays.asList(1, 2, 3, 5));
        expected.add(Arrays.asList(1, 2, 4, 5));
        expected.add(Arrays.asList(1, 3, 4, 5));
        expected.add(Arrays.asList(2, 3, 4, 5));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test46() {
        int n = 6;
        int k = 4;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3, 4));
        expected.add(Arrays.asList(1, 2, 3, 5));
        expected.add(Arrays.asList(1, 2, 4, 5));
        expected.add(Arrays.asList(1, 3, 4, 5));
        expected.add(Arrays.asList(2, 3, 4, 5));
        expected.add(Arrays.asList(1, 2, 3, 6));
        expected.add(Arrays.asList(1, 2, 4, 6));
        expected.add(Arrays.asList(1, 3, 4, 6));
        expected.add(Arrays.asList(2, 3, 4, 6));
        expected.add(Arrays.asList(1, 2, 5, 6));
        expected.add(Arrays.asList(1, 3, 5, 6));
        expected.add(Arrays.asList(2, 3, 5, 6));
        expected.add(Arrays.asList(1, 4, 5, 6));
        expected.add(Arrays.asList(2, 4, 5, 6));
        expected.add(Arrays.asList(3, 4, 5, 6));
        assertListEquals(expected, combinations);
    }

    @Test
    public void test68() {
        int n = 8;
        int k = 6;
        List<List<Integer>> combinations = solution.combine(n, k);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        expected.add(Arrays.asList(1, 2, 3, 4, 5, 7));
        expected.add(Arrays.asList(1, 2, 3, 4, 6, 7));
        expected.add(Arrays.asList(1, 2, 3, 5, 6, 7));
        expected.add(Arrays.asList(1, 2, 4, 5, 6, 7));
        expected.add(Arrays.asList(1, 3, 4, 5, 6, 7));
        expected.add(Arrays.asList(2, 3, 4, 5, 6, 7));
        expected.add(Arrays.asList(1, 2, 3, 4, 5, 8));
        expected.add(Arrays.asList(1, 2, 3, 4, 6, 8));
        expected.add(Arrays.asList(1, 2, 3, 5, 6, 8));
        expected.add(Arrays.asList(1, 2, 4, 5, 6, 8));
        expected.add(Arrays.asList(1, 3, 4, 5, 6, 8));
        expected.add(Arrays.asList(2, 3, 4, 5, 6, 8));
        expected.add(Arrays.asList(1, 2, 3, 4, 7, 8));
        expected.add(Arrays.asList(1, 2, 3, 5, 7, 8));
        expected.add(Arrays.asList(1, 2, 4, 5, 7, 8));
        expected.add(Arrays.asList(1, 3, 4, 5, 7, 8));
        expected.add(Arrays.asList(2, 3, 4, 5, 7, 8));
        expected.add(Arrays.asList(1, 2, 3, 6, 7, 8));
        expected.add(Arrays.asList(1, 2, 4, 6, 7, 8));
        expected.add(Arrays.asList(1, 3, 4, 6, 7, 8));
        expected.add(Arrays.asList(2, 3, 4, 6, 7, 8));
        expected.add(Arrays.asList(1, 2, 5, 6, 7, 8));
        expected.add(Arrays.asList(1, 3, 5, 6, 7, 8));
        expected.add(Arrays.asList(2, 3, 5, 6, 7, 8));
        expected.add(Arrays.asList(1, 4, 5, 6, 7, 8));
        expected.add(Arrays.asList(2, 4, 5, 6, 7, 8));
        expected.add(Arrays.asList(3, 4, 5, 6, 7, 8));
        assertListEquals(expected, combinations);
    }

    private void assertListEquals(List<List<Integer>> expected, List<List<Integer>> combinations) {
        assertEquals(expected.size(), combinations.size());
        Integer[] array = new Integer[0];
        for (int i = 0; i < expected.size(); i++) {
            List<Integer> e1 = expected.get(i);
            List<Integer> c1 = combinations.get(i);
            assertArrayEquals(e1.toArray(array), c1.toArray(array));
        }
    }

}