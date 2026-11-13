package com.github.xumeng.kotlin.problems.medium.problem0078

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0078Test {

    private val solution = Solution0078()

    @Test
    fun test1() {
        val nums = intArrayOf(0)
        val subsets: List<List<Int>> = solution.subsets(nums)
        val subset1: List<Int> = listOf()
        val subset2: List<Int> = listOf(0)
        val expected: List<List<Int>> = listOf(subset1, subset2)
        assertListEquals(expected, subsets)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2)
        val subsets: List<List<Int>> = solution.subsets(nums)
        val subset1: List<Int> = listOf()
        val subset2: List<Int> = listOf(1)
        val subset3: List<Int> = listOf(2)
        val subset4: List<Int> = listOf(1, 2)
        val expected: List<List<Int>> = listOf(subset1, subset2, subset3, subset4)
        assertListEquals(expected, subsets)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 3)
        val subsets: List<List<Int>> = solution.subsets(nums)
        val subset1: List<Int> = listOf()
        val subset2: List<Int> = listOf(1)
        val subset3: List<Int> = listOf(2)
        val subset4: List<Int> = listOf(3)
        val subset5: List<Int> = listOf(1, 2)
        val subset6: List<Int> = listOf(1, 3)
        val subset7: List<Int> = listOf(2, 3)
        val subset8: List<Int> = listOf(1, 2, 3)
        val expected: List<List<Int>> = listOf(subset1, subset2, subset3, subset4, subset5, subset6, subset7, subset8)
        assertListEquals(expected, subsets)
    }

    @Test
    fun test4() {
        val nums = intArrayOf(-1, 2, 4)
        val subsets: List<List<Int>> = solution.subsets(nums)
        val subset1: List<Int> = listOf()
        val subset2: List<Int> = listOf(-1)
        val subset3: List<Int> = listOf(2)
        val subset4: List<Int> = listOf(4)
        val subset5: List<Int> = listOf(-1, 2)
        val subset6: List<Int> = listOf(-1, 4)
        val subset7: List<Int> = listOf(2, 4)
        val subset8: List<Int> = listOf(-1, 2, 4)
        val expected: List<List<Int>> = listOf(subset1, subset2, subset3, subset4, subset5, subset6, subset7, subset8)
        assertListEquals(expected, subsets)
    }

    private fun assertListEquals(expected: List<List<Int>>, subsets: List<List<Int>>) {
        assertEquals(expected.size, subsets.size)
        for (i in expected.indices) {
            val e1 = expected[i]
            val s1 = subsets[i]
            assertArrayEquals(e1.toTypedArray(), s1.toTypedArray())
        }
    }

}