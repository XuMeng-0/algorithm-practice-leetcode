package com.github.xumeng.kotlin.problems.medium.problem0077

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0077Test {

    private val solution = Solution0077()

    @Test
    fun test11() {
        val n = 1
        val k = 1
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test12() {
        val n = 2
        val k = 1
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1))
        expected.add(listOf(2))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test13() {
        val n = 3
        val k = 1
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1))
        expected.add(listOf(2))
        expected.add(listOf(3))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test22() {
        val n = 2
        val k = 2
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test23() {
        val n = 3
        val k = 2
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2))
        expected.add(listOf(1, 3))
        expected.add(listOf(2, 3))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test24() {
        val n = 4
        val k = 2
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2))
        expected.add(listOf(1, 3))
        expected.add(listOf(2, 3))
        expected.add(listOf(1, 4))
        expected.add(listOf(2, 4))
        expected.add(listOf(3, 4))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test33() {
        val n = 3
        val k = 3
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2, 3))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test34() {
        val n = 4
        val k = 3
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2, 3))
        expected.add(listOf(1, 2, 4))
        expected.add(listOf(1, 3, 4))
        expected.add(listOf(2, 3, 4))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test35() {
        val n = 5
        val k = 3
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2, 3))
        expected.add(listOf(1, 2, 4))
        expected.add(listOf(1, 3, 4))
        expected.add(listOf(2, 3, 4))
        expected.add(listOf(1, 2, 5))
        expected.add(listOf(1, 3, 5))
        expected.add(listOf(2, 3, 5))
        expected.add(listOf(1, 4, 5))
        expected.add(listOf(2, 4, 5))
        expected.add(listOf(3, 4, 5))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test44() {
        val n = 4
        val k = 4
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2, 3, 4))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test45() {
        val n = 5
        val k = 4
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2, 3, 4))
        expected.add(listOf(1, 2, 3, 5))
        expected.add(listOf(1, 2, 4, 5))
        expected.add(listOf(1, 3, 4, 5))
        expected.add(listOf(2, 3, 4, 5))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test46() {
        val n = 6
        val k = 4
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2, 3, 4))
        expected.add(listOf(1, 2, 3, 5))
        expected.add(listOf(1, 2, 4, 5))
        expected.add(listOf(1, 3, 4, 5))
        expected.add(listOf(2, 3, 4, 5))
        expected.add(listOf(1, 2, 3, 6))
        expected.add(listOf(1, 2, 4, 6))
        expected.add(listOf(1, 3, 4, 6))
        expected.add(listOf(2, 3, 4, 6))
        expected.add(listOf(1, 2, 5, 6))
        expected.add(listOf(1, 3, 5, 6))
        expected.add(listOf(2, 3, 5, 6))
        expected.add(listOf(1, 4, 5, 6))
        expected.add(listOf(2, 4, 5, 6))
        expected.add(listOf(3, 4, 5, 6))
        assertListEquals(expected, combinations)
    }

    @Test
    fun test68() {
        val n = 8
        val k = 6
        val combinations: List<List<Int>> = solution.combine(n, k)
        val expected = mutableListOf<List<Int>>()
        expected.add(listOf(1, 2, 3, 4, 5, 6))
        expected.add(listOf(1, 2, 3, 4, 5, 7))
        expected.add(listOf(1, 2, 3, 4, 6, 7))
        expected.add(listOf(1, 2, 3, 5, 6, 7))
        expected.add(listOf(1, 2, 4, 5, 6, 7))
        expected.add(listOf(1, 3, 4, 5, 6, 7))
        expected.add(listOf(2, 3, 4, 5, 6, 7))
        expected.add(listOf(1, 2, 3, 4, 5, 8))
        expected.add(listOf(1, 2, 3, 4, 6, 8))
        expected.add(listOf(1, 2, 3, 5, 6, 8))
        expected.add(listOf(1, 2, 4, 5, 6, 8))
        expected.add(listOf(1, 3, 4, 5, 6, 8))
        expected.add(listOf(2, 3, 4, 5, 6, 8))
        expected.add(listOf(1, 2, 3, 4, 7, 8))
        expected.add(listOf(1, 2, 3, 5, 7, 8))
        expected.add(listOf(1, 2, 4, 5, 7, 8))
        expected.add(listOf(1, 3, 4, 5, 7, 8))
        expected.add(listOf(2, 3, 4, 5, 7, 8))
        expected.add(listOf(1, 2, 3, 6, 7, 8))
        expected.add(listOf(1, 2, 4, 6, 7, 8))
        expected.add(listOf(1, 3, 4, 6, 7, 8))
        expected.add(listOf(2, 3, 4, 6, 7, 8))
        expected.add(listOf(1, 2, 5, 6, 7, 8))
        expected.add(listOf(1, 3, 5, 6, 7, 8))
        expected.add(listOf(2, 3, 5, 6, 7, 8))
        expected.add(listOf(1, 4, 5, 6, 7, 8))
        expected.add(listOf(2, 4, 5, 6, 7, 8))
        expected.add(listOf(3, 4, 5, 6, 7, 8))
        assertListEquals(expected, combinations)
    }

    private fun assertListEquals(expected: List<List<Int>>, combinations: List<List<Int>>) {
        assertEquals(expected.size, combinations.size)
        for (i in expected.indices) {
            val e1: List<Int> = expected[i]
            val c1: List<Int> = combinations[i]
            assertArrayEquals(e1.toTypedArray(), c1.toTypedArray())
        }
    }

}