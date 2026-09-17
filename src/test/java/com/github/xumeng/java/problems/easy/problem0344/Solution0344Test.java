package com.github.xumeng.java.problems.easy.problem0344;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0344Test {

    private final Solution0344 solution = new Solution0344();

    @Test
    public void test1() {
        char[] s = {'a'};
        solution.reverseString(s);
        char[] expected = {'a'};
        assertArrayEquals(expected, s);
    }

    @Test
    public void test2() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(expected, s);
    }

    @Test
    public void test3() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s);
        char[] expected = {'h', 'a', 'n', 'n', 'a', 'H'};
        assertArrayEquals(expected, s);
    }

}