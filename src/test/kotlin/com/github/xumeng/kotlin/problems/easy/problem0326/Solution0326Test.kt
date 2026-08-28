package com.github.xumeng.kotlin.problems.easy.problem0326

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0326Test {

    private val solution = Solution0326()


    @Test
    fun test1() {
        val n = -1
        val isPowerOfThree = solution.isPowerOfThree(n)
        assertFalse(isPowerOfThree)
    }

    @Test
    fun test2() {
        val n = 0
        val isPowerOfThree = solution.isPowerOfThree(n)
        assertFalse(isPowerOfThree)
    }

    @Test
    fun test3() {
        val n = 9
        val isPowerOfThree = solution.isPowerOfThree(n)
        assertTrue(isPowerOfThree)
    }

    @Test
    fun test4() {
        val n = 27
        val isPowerOfThree = solution.isPowerOfThree(n)
        assertTrue(isPowerOfThree)
    }

    @Test
    fun test5() {
        val n = 45
        val isPowerOfThree = solution.isPowerOfThree(n)
        assertFalse(isPowerOfThree)
    }

    @Test
    fun test6() {
        val n = 2147483647
        val isPowerOfThree = solution.isPowerOfThree(n)
        assertFalse(isPowerOfThree)
    }
}