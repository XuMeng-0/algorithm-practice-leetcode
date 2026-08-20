package com.github.xumeng.java.problems.easy.problem0290;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0290Test {

    private final Solution0290 solution = new Solution0290();

    @Test
    public void test1() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean suitable = solution.wordPattern(pattern, s);
        assertTrue(suitable);
    }

    @Test
    public void test2() {
        String pattern = "abba";
        String s = "dog cat cat fish";
        boolean suitable = solution.wordPattern(pattern, s);
        assertFalse(suitable);
    }

    @Test
    public void test3() {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        boolean suitable = solution.wordPattern(pattern, s);
        assertFalse(suitable);
    }

    @Test
    public void test4() {
        String pattern = "a";
        String s = "dog";
        boolean suitable = solution.wordPattern(pattern, s);
        assertTrue(suitable);
    }

    @Test
    public void test5() {
        String pattern = "a";
        String s = "dog cat";
        boolean suitable = solution.wordPattern(pattern, s);
        assertFalse(suitable);
    }

    @Test
    public void test6() {
        String pattern = "ab";
        String s = "cat cat";
        boolean suitable = solution.wordPattern(pattern, s);
        assertFalse(suitable);
    }

}