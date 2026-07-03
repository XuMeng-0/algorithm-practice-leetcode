package com.github.xumeng.java.problems.easy.problem0191;

import com.github.xumeng.java.problems.easy.problem0191.Solution0191;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0191Test {

    private Solution0191 solution = new Solution0191();

    @Test
    public void test1() {
        int count = solution.hammingWeight(1);
        assertEquals(1, count);
    }

    @Test
    public void test2() {
        int count = solution.hammingWeight(11);
        assertEquals(3, count);
    }

    @Test
    public void test3() {
        int count = solution.hammingWeight(128);
        assertEquals(1, count);
    }

    @Test
    public void test4() {
        int count = solution.hammingWeight(2147483645);
        assertEquals(30, count);
    }

}