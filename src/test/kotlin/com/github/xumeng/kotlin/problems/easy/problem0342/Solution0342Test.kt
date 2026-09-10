package com.github.xumeng.kotlin.problems.easy.problem0342

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0342Test {

    private val solution = Solution0342()

    @Test
    fun test1() {
        val n = -1
        val isPowerOfFour = solution.isPowerOfFour(n)
        assertFalse(isPowerOfFour)
    }

    @Test
    fun test2() {
        val n = 0
        val isPowerOfFour = solution.isPowerOfFour(n)
        assertFalse(isPowerOfFour)
    }

    @Test
    fun test3() {
        val n = 1
        val isPowerOfFour = solution.isPowerOfFour(n)
        assertTrue(isPowerOfFour)
    }

    @Test
    fun test4() {
        val n = 5
        val isPowerOfFour = solution.isPowerOfFour(n)
        assertFalse(isPowerOfFour)
    }

    @Test
    fun test5() {
        val n = 16
        val isPowerOfFour = solution.isPowerOfFour(n)
        assertTrue(isPowerOfFour)
    }

    @Test
    fun test6() {
        val n = 2147483647
        val isPowerOfFour = solution.isPowerOfFour(n)
        assertFalse(isPowerOfFour)
    }


}