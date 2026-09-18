package com.github.xumeng.java.problems.easy.problem0345;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0345Test {

    private final Solution0345 solution = new Solution0345();

    @Test
    public void test1() {
        String s = "IceCreAm";
        String result = solution.reverseVowels(s);
        String expected = "AceCreIm";
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        String s = "leetcode";
        String result = solution.reverseVowels(s);
        String expected = "leotcede";
        assertEquals(expected, result);
    }

    @Test
    public void test3() {
        String s = "a";
        String result = solution.reverseVowels(s);
        String expected = "a";
        assertEquals(expected, result);
    }

    @Test
    public void test4() {
        String s = "b";
        String result = solution.reverseVowels(s);
        String expected = "b";
        assertEquals(expected, result);
    }

}