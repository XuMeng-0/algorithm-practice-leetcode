package com.github.xumeng.kotlin.problems.medium.problem0080

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0080Test {

    private val solution = Solution0080()

    @Test
    fun test11() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val length = solution.removeDuplicates(nums)
        val expected = intArrayOf(1, 1, 2, 2, 3)
        assertEquals(expected.size, length)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun test12() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        val length = solution.removeDuplicates(nums)
        val expected = intArrayOf(0, 0, 1, 1, 2, 3, 3)
        assertEquals(expected.size, length)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun test21() {
        val nums = intArrayOf(0)
        val length = solution.removeDuplicates(nums)
        val expected = intArrayOf(0)
        assertEquals(expected.size, length)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun test31() {
        val nums = intArrayOf(0, 1)
        val length = solution.removeDuplicates(nums)
        val expected = intArrayOf(0, 1)
        assertEquals(expected.size, length)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun test32() {
        val nums = intArrayOf(0, 0)
        val length = solution.removeDuplicates(nums)
        val expected = intArrayOf(0, 0)
        assertEquals(expected.size, length)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun test41() {
        val nums = intArrayOf(0, 1, 2)
        val length = solution.removeDuplicates(nums)
        val expected = intArrayOf(0, 1, 2)
        assertEquals(expected.size, length)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun test42() {
        val nums = intArrayOf(0, 0, 0)
        val length = solution.removeDuplicates(nums)
        val expected = intArrayOf(0, 0)
        assertEquals(expected.size, length)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun test51() {
        val nums = intArrayOf(0, 0, 0, 0)
        val length = solution.removeDuplicates(nums)
        val expected = intArrayOf(0, 0)
        assertEquals(expected.size, length)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

    @Test
    fun test52() {
        val nums = intArrayOf(0, 0, 0, 0, 1, 1, 1, 1)
        val length = solution.removeDuplicates(nums)
        val expected = intArrayOf(0, 0, 1, 1)
        assertEquals(expected.size, length)
        for (i in expected.indices) {
            assertEquals(expected[i], nums[i])
        }
    }

}