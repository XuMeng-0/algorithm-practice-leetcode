package com.github.xumeng.kotlin.problems.easy.problem0367

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0367Test {

    private val solution = Solution0367()

    @Test
    fun test1() {
        val num = 1
        val isPerfectSquare = solution.isPerfectSquare(num)
        assertTrue(isPerfectSquare)
    }

    @Test
    fun test2() {
        val num = 2
        val isPerfectSquare = solution.isPerfectSquare(num)
        assertFalse(isPerfectSquare)
    }

    @Test
    fun test3() {
        val num = 14
        val isPerfectSquare = solution.isPerfectSquare(num)
        assertFalse(isPerfectSquare)
    }

    @Test
    fun test4() {
        val num = 16
        val isPerfectSquare = solution.isPerfectSquare(num)
        assertTrue(isPerfectSquare)
    }

    @Test
    fun test5() {
        val num = 2147483647
        val isPerfectSquare = solution.isPerfectSquare(num)
        assertFalse(isPerfectSquare)
    }
}