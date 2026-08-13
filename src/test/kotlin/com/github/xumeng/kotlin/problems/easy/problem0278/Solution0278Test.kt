package com.github.xumeng.kotlin.problems.easy.problem0278

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0278Test {

    private val solution = Solution0278()

    @Test
    fun test1() {
        val n = 5
        val expected = 4
        solution.setBacVersion(expected)
        val bad = solution.firstBadVersion(n)
        assertEquals(expected, bad)
    }

    @Test
    fun test2() {
        val n = 1
        val expected = 1
        solution.setBacVersion(expected)
        val bad = solution.firstBadVersion(n)
        assertEquals(expected, bad)
    }

    @Test
    fun test3() {
        val n = 2147483647
        val expected = 100
        solution.setBacVersion(expected)
        val bad = solution.firstBadVersion(n)
        assertEquals(expected, bad)
    }

    @Test
    fun test4() {
        val n = 2147483647
        val expected = 2147483547
        solution.setBacVersion(expected)
        val bad = solution.firstBadVersion(n)
        assertEquals(expected, bad)
    }

}