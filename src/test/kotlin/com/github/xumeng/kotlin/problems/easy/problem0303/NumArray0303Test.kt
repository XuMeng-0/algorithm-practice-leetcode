package com.github.xumeng.kotlin.problems.easy.problem0303

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumArray0303Test {

    @Test
    fun test() {
        val array: IntArray = intArrayOf(-2, 0, 3, -5, 2, -1)
        val numArray = NumArray0303(array)
        assertEquals(1, numArray.sumRange(0, 2))
        assertEquals(-1, numArray.sumRange(2, 5))
        assertEquals(-3, numArray.sumRange(0, 5))
        assertEquals(-2, numArray.sumRange(0, 0))
    }

}