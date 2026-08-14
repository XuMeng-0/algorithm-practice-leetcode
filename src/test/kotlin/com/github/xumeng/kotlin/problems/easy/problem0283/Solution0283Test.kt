package com.github.xumeng.kotlin.problems.easy.problem0283

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0283Test {

    private val solution = Solution0283S1()

    @Test
    fun test1() {
        val nums: IntArray = intArrayOf(0)
        solution.moveZeroes(nums)
        val expected: IntArray = intArrayOf(0)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test2() {
        val nums: IntArray = intArrayOf(0, 1, 0, 3, 12)
        solution.moveZeroes(nums)
        val expected: IntArray = intArrayOf(1, 3, 12, 0, 0)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test3() {
        val nums: IntArray = intArrayOf(1, 0, -1)
        solution.moveZeroes(nums)
        val expected: IntArray = intArrayOf(1, -1, 0)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test4() {
        val nums: IntArray = intArrayOf(-1, 0, 1)
        solution.moveZeroes(nums)
        val expected: IntArray = intArrayOf(-1, 1, 0)
        assertArrayEquals(expected, nums)
    }

}