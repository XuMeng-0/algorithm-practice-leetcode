package com.github.xumeng.kotlin.problems.medium.problem0075

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0075Test {

    private val solution = Solution0075S1()


    @Test
    fun test1() {
        val nums = intArrayOf(2, 0, 2, 1, 1, 0)
        solution.sortColors(nums)
        val expected = intArrayOf(0, 0, 1, 1, 2, 2)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 0, 1)
        solution.sortColors(nums)
        val expected = intArrayOf(0, 1, 2)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0)
        solution.sortColors(nums)
        val expected = intArrayOf(0)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test4() {
        val nums = intArrayOf(0, 1)
        solution.sortColors(nums)
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test5() {
        val nums = intArrayOf(0, 2)
        solution.sortColors(nums)
        val expected = intArrayOf(0, 2)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test6() {
        val nums = intArrayOf(1, 2)
        solution.sortColors(nums)
        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test7() {
        val nums = intArrayOf(1, 0)
        solution.sortColors(nums)
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test8() {
        val nums = intArrayOf(2, 0)
        solution.sortColors(nums)
        val expected = intArrayOf(0, 2)
        assertArrayEquals(expected, nums)
    }

    @Test
    fun test9() {
        val nums = intArrayOf(2, 1)
        solution.sortColors(nums)
        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, nums)
    }

}