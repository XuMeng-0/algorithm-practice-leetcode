package com.github.xumeng.kotlin.problems.easy.problem0344

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0344Test {

    private val solution = Solution0344()

    @Test
    fun test1() {
        val s = charArrayOf('a')
        solution.reverseString(s)
        val expected = charArrayOf('a')
        assertArrayEquals(expected, s)
    }

    @Test
    fun test2() {
        val s = charArrayOf('h', 'e', 'l', 'l', 'o')
        solution.reverseString(s)
        val expected = charArrayOf('o', 'l', 'l', 'e', 'h')
        assertArrayEquals(expected, s)
    }

    @Test
    fun test3() {
        val s = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
        solution.reverseString(s)
        val expected = charArrayOf('h', 'a', 'n', 'n', 'a', 'H')
        assertArrayEquals(expected, s)
    }

}