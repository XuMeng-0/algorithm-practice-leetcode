package com.github.xumeng.java.problems.medium.problem0062;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0062Test {

    private final Solution0062 solution = new Solution0062();

    @Test
    public void test1() {
        int m = 1;
        int n = 1;
        int paths = solution.uniquePaths(m, n);
        assertEquals(1, paths);
    }

    @Test
    public void test2() {
        int m = 3;
        int n = 2;
        int paths = solution.uniquePaths(m, n);
        assertEquals(3, paths);
    }

    @Test
    public void test3() {
        int m = 3;
        int n = 3;
        int paths = solution.uniquePaths(m, n);
        assertEquals(6, paths);
    }

    @Test
    public void test4() {
        int m = 3;
        int n = 7;
        int paths = solution.uniquePaths(m, n);
        assertEquals(28, paths);
    }

    @Test
    public void test5() {
        int m = 7;
        int n = 3;
        int paths = solution.uniquePaths(m, n);
        assertEquals(28, paths);
    }

    @Test
    public void test6() {
        int m = 17;
        int n = 17;
        int paths = solution.uniquePaths(m, n);
        assertEquals(601080390, paths);
    }

    @Test
    public void test7() {
        int m = 10;
        int n = 40;
        int paths = solution.uniquePaths(m, n);
        assertEquals(1677106640, paths);
    }

}