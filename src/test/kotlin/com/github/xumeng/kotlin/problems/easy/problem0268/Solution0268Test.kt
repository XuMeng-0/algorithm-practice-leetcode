package com.github.xumeng.kotlin.problems.easy.problem0268

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0268Test {

    private val solution = Solution0268()

    @Test
    fun test1() {
        val nums: IntArray = intArrayOf(3, 0, 1)
        val number = solution.missingNumber(nums)
        assertEquals(2, number)
    }

    @Test
    fun test2() {
        val nums: IntArray = intArrayOf(0, 1)
        val number = solution.missingNumber(nums)
        assertEquals(2, number)
    }

    @Test
    fun test3() {
        val nums: IntArray = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)
        val number = solution.missingNumber(nums)
        assertEquals(8, number)
    }

    @Test
    fun test4() {
        val nums: IntArray = intArrayOf(0)
        val number = solution.missingNumber(nums)
        assertEquals(1, number)
    }

}