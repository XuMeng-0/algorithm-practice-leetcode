package com.github.xumeng.problems.easy.problem0190;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0190Test {

    private Solution0190 solution = new Solution0190();

    @Test
    public void test1() {
        int result = solution.reverseBits(0);
        assertEquals(0, result);
    }

    @Test
    public void test2() {
        int result = solution.reverseBits(2);
        assertEquals(1073741824, result);
    }

    @Test
    public void test3() {
        int result = solution.reverseBits(4);
        assertEquals(536870912, result);
    }

    @Test
    public void test4() {
        int result = solution.reverseBits(8);
        assertEquals(268435456, result);
    }

    @Test
    public void test5() {
        int result = solution.reverseBits(43261596);
        assertEquals(964176192, result);
    }

    @Test
    public void test6() {
        int result = solution.reverseBits(2147483644);
        assertEquals(1073741822, result);
    }

}