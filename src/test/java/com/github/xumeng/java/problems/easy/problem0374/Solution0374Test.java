package com.github.xumeng.java.problems.easy.problem0374;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0374Test {

    private final Solution0374 solution = new Solution0374();

    @Test
    public void test1() {
        int n = 10;
        int pick = 6;
        solution.setNumber(pick);
        int number = solution.guessNumber(n);
        assertEquals(pick, number);
    }

    @Test
    public void test2() {
        int n = 1;
        int pick = 1;
        solution.setNumber(pick);
        int number = solution.guessNumber(n);
        assertEquals(pick, number);
    }

    @Test
    public void test3() {
        int n = 2;
        int pick = 1;
        solution.setNumber(pick);
        int number = solution.guessNumber(n);
        assertEquals(pick, number);
    }

    @Test
    public void test4() {
        int n = 2147483647;
        int pick = 2147483640;
        solution.setNumber(pick);
        int number = solution.guessNumber(n);
        assertEquals(pick, number);
    }

    @Test
    public void test5() {
        int n = 50;
        int pick = 20;
        solution.setNumber(pick);
        int number = solution.guessNumber(n);
        assertEquals(pick, number);
    }

    @Test
    public void test6() {
        int n = 2;
        int pick = 2;
        solution.setNumber(pick);
        int number = solution.guessNumber(n);
        assertEquals(pick, number);
    }

}