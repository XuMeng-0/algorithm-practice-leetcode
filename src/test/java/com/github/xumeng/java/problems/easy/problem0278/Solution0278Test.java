package com.github.xumeng.java.problems.easy.problem0278;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0278Test {

    private final Solution0278 solution = new Solution0278();

    @Test
    public void test1() {
        int n = 5;
        int expected = 4;
        solution.setBadVersion(expected);
        int bad = solution.firstBadVersion(n);
        assertEquals(expected, bad);
    }

    @Test
    public void test2() {
        int n = 1;
        int expected = 1;
        solution.setBadVersion(expected);
        int bad = solution.firstBadVersion(n);
        assertEquals(expected, bad);
    }

    @Test
    public void test3() {
        int n = 2147483647;
        int expected = 100;
        solution.setBadVersion(expected);
        int bad = solution.firstBadVersion(n);
        assertEquals(expected, bad);
    }

    @Test
    public void test4() {
        int n = 2147483647;
        int expected = 2147483547;
        solution.setBadVersion(expected);
        int bad = solution.firstBadVersion(n);
        assertEquals(expected, bad);
    }

}