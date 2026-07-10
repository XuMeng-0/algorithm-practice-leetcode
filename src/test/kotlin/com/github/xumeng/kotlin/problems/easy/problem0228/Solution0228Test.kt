package com.github.xumeng.kotlin.problems.easy.problem0228

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Solution0228Test {

    private val solution: Solution0228 = Solution0228()

    @Test
    fun test1() {
        val nums: IntArray = intArrayOf(0, 1, 2, 4, 5, 7)
        val result: List<String> = solution.summaryRanges(nums)
        val expected: MutableList<String> = mutableListOf()
        expected.add("0->2")
        expected.add("4->5")
        expected.add("7")
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

    @Test
    fun test2() {
        val nums: IntArray = intArrayOf(0, 2, 3, 4, 6, 8, 9)
        val result: List<String> = solution.summaryRanges(nums)
        val expected: MutableList<String> = mutableListOf()
        expected.add("0")
        expected.add("2->4")
        expected.add("6")
        expected.add("8->9")
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

    @Test
    fun test3() {
        val nums: IntArray = intArrayOf()
        val result: List<String> = solution.summaryRanges(nums)
        val expected: MutableList<String> = mutableListOf()
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

    @Test
    fun test4() {
        val nums: IntArray = intArrayOf(1)
        val result: List<String> = solution.summaryRanges(nums)
        val expected: MutableList<String> = mutableListOf()
        expected.add("1")
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

    @Test
    fun test5() {
        val nums: IntArray = intArrayOf(0, 1, 2, 3, 4, 5)
        val result: List<String> = solution.summaryRanges(nums)
        val expected: MutableList<String> = mutableListOf()
        expected.add("0->5")
        assertArrayEquals(expected.toTypedArray(), result.toTypedArray())
    }

}