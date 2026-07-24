package com.github.xumeng.java.problems.easy.problem0242;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0242Test {

    private final Solution0242 solution = new Solution0242();

    @Test
    public void test1() {
        String s = "anagram";
        String t = "nagaram";
        boolean isAnagram = solution.isAnagram(s, t);
        assertTrue(isAnagram);
    }

    @Test
    public void test2() {
        String s = "rat";
        String t = "car";
        boolean isAnagram = solution.isAnagram(s, t);
        assertFalse(isAnagram);
    }

    @Test
    public void test3() {
        String s = "a";
        String t = "b";
        boolean isAnagram = solution.isAnagram(s, t);
        assertFalse(isAnagram);
    }

    @Test
    public void test4() {
        String s = "a";
        String t = "a";
        boolean isAnagram = solution.isAnagram(s, t);
        assertTrue(isAnagram);
    }

    @Test
    public void test5() {
        String s = "a";
        String t = "ab";
        boolean isAnagram = solution.isAnagram(s, t);
        assertFalse(isAnagram);
    }

    @Test
    public void test6() {
        String s = "ab";
        String t = "a";
        boolean isAnagram = solution.isAnagram(s, t);
        assertFalse(isAnagram);
    }

    @Test
    public void test7() {
        String s = "ba";
        String t = "ab";
        boolean isAnagram = solution.isAnagram(s, t);
        assertTrue(isAnagram);
    }

}