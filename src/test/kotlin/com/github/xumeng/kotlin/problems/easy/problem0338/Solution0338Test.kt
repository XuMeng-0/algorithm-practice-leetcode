package com.github.xumeng.kotlin.problems.easy.problem0338

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0338Test {

    private val solution = Solution0338()

    @Test
    fun test1() {
        val n = 0
        val result = solution.countBits(n)
        val expected = intArrayOf(0)
        assertArrayEquals(expected, result)
    }

    @Test
    fun test2() {
        val n = 1
        val result = solution.countBits(n)
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, result)
    }

    @Test
    fun test3() {
        val n = 2
        val result = solution.countBits(n)
        val expected = intArrayOf(0, 1, 1)
        assertArrayEquals(expected, result)
    }

    @Test
    fun test4() {
        val n = 5
        val result = solution.countBits(n)
        val expected = intArrayOf(0, 1, 1, 2, 1, 2)
        assertArrayEquals(expected, result)
    }

}