package com.github.xumeng.kotlin.problems.easy.problem0263

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0263Test {

    private val solution = Solution0263()

    @Test
    fun test1() {
        val isUgly = solution.isUgly(-1)
        assertFalse(isUgly)
    }

    @Test
    fun test2() {
        val isUgly = solution.isUgly(0)
        assertFalse(isUgly)
    }

    @Test
    fun test3() {
        val isUgly = solution.isUgly(1)
        assertTrue(isUgly)
    }

    @Test
    fun test4() {
        val isUgly = solution.isUgly(6)
        assertTrue(isUgly)
    }

    @Test
    fun test5() {
        val isUgly = solution.isUgly(14)
        assertFalse(isUgly)
    }

    @Test
    fun test6() {
        val isUgly = solution.isUgly(60)
        assertTrue(isUgly)
    }

    @Test
    fun test7() {
        val isUgly = solution.isUgly(2147483647)
        assertFalse(isUgly)
    }

    @Test
    fun test8() {
        val isUgly = solution.isUgly(9)
        assertTrue(isUgly)
    }
}