package com.github.xumeng.kotlin.problems.easy.problem0349

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0349Test {

    private val solution = Solution0349()

    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)
        val intersection = solution.intersection(nums1, nums2)
        val expected = intArrayOf(2)
        assertArrayEquals(expected, intersection)
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(4, 9, 5)
        val nums2 = intArrayOf(9, 4, 9, 8, 4)
        val intersection = solution.intersection(nums1, nums2)
        val expected = intArrayOf(4, 9)
        assertArrayEquals(expected, intersection)
    }

}