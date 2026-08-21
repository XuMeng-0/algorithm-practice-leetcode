package com.github.xumeng.java.problems.easy.problem0292;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0292Test {

    private final Solution0292 solution = new Solution0292();

    @Test
    public void test1() {
        int n = 1;
        boolean canWin = solution.canWinNim(n);
        assertTrue(canWin);
    }

    @Test
    public void test2() {
        int n = 2;
        boolean canWin = solution.canWinNim(n);
        assertTrue(canWin);
    }

    @Test
    public void test3() {
        int n = 3;
        boolean canWin = solution.canWinNim(n);
        assertTrue(canWin);
    }

    @Test
    public void test4() {
        int n = 4;
        boolean canWin = solution.canWinNim(n);
        assertFalse(canWin);
    }

    @Test
    public void test5() {
        int n = 2147483647;
        boolean canWin = solution.canWinNim(n);
        assertTrue(canWin);
    }

}