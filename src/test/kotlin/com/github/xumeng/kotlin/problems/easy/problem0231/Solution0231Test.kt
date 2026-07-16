package com.github.xumeng.kotlin.problems.easy.problem0231

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0231Test {

    private val solution: Solution0231S1 = Solution0231S1()

    @Test
    fun test1() {
        val n = 1
        val result: Boolean = solution.isPowerOfTwo(n)
        assertTrue { result }
    }

    @Test
    fun test2() {
        val n = 3
        val result: Boolean = solution.isPowerOfTwo(n)
        assertFalse { result }
    }

    @Test
    fun test3() {
        val n = 16
        val result: Boolean = solution.isPowerOfTwo(n)
        assertTrue { result }
    }

    @Test
    fun test4() {
        val n = 0
        val result: Boolean = solution.isPowerOfTwo(n)
        assertFalse { result }
    }

    @Test
    fun test5() {
        val n = -1
        val result: Boolean = solution.isPowerOfTwo(n)
        assertFalse { result }
    }

    @Test
    fun test6() {
        val n = 6
        val result: Boolean = solution.isPowerOfTwo(n)
        assertFalse { result }
    }
}