package com.github.xumeng.java.problems.easy.problem0303;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumArray0303Test {

    @Test
    public void test() {
        int[] array = {-2, 0, 3, -5, 2, -1};
        NumArray0303 numArray = new NumArray0303(array);
        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(-1, numArray.sumRange(2, 5));
        assertEquals(-3, numArray.sumRange(0, 5));
        assertEquals(-2, numArray.sumRange(0, 0));
    }

}