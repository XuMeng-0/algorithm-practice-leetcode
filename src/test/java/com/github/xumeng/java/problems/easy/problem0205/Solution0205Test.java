package com.github.xumeng.java.problems.easy.problem0205;

import com.github.xumeng.java.problems.easy.problem0205.Solution0205;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0205Test {

    private final Solution0205 solution = new Solution0205();

    @Test
    public void test1() {
        String s = "egg";
        String t = "add";
        assertTrue(solution.isIsomorphic(s, t));
    }

    @Test
    public void test2() {
        String s = "foo";
        String t = "bar";
        assertFalse(solution.isIsomorphic(s, t));
    }

    @Test
    public void test3() {
        String s = "paper";
        String t = "title";
        assertTrue(solution.isIsomorphic(s, t));
    }

    @Test
    public void test4() {
        String s = "f11";
        String t = "b23";
        assertFalse(solution.isIsomorphic(s, t));
    }

    @Test
    public void test5() {
        String s = "1";
        String t = "3";
        assertTrue(solution.isIsomorphic(s, t));
    }

    @Test
    public void test6() {
        String s = "badc";
        String t = "baba";
        assertFalse(solution.isIsomorphic(s, t));
    }

}