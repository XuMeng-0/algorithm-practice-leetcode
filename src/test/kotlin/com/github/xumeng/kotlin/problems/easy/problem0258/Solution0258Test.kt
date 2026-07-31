package com.github.xumeng.kotlin.problems.easy.problem0258

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0258Test {

    private val solution = Solution0258()

    @Test
    fun test1() {
        val num = 38
        val sum = solution.addDigits(num)
        assertEquals(2, sum)
    }

    @Test
    fun test2() {
        val num = 0
        val sum = solution.addDigits(num)
        assertEquals(0, sum)
    }

    @Test
    fun test3() {
        val num = 2147483647
        val sum = solution.addDigits(num)
        assertEquals(1, sum)
    }

}