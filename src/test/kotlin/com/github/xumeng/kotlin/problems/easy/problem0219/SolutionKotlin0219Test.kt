package com.github.xumeng.kotlin.problems.easy.problem0219

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionKotlin0219Test {

    private val solution: SolutionKotlin0219 = SolutionKotlin0219()

    @Test
    fun test1() {
        val nums: IntArray = intArrayOf(1, 2, 3, 1)
        val k = 3
        assertTrue { solution.containsNearbyDuplicate(nums, k) }
    }

    @Test
    fun test2() {
        val nums: IntArray = intArrayOf(1, 0, 1, 1)
        val k = 1
        assertTrue { solution.containsNearbyDuplicate(nums, k) }
    }

    @Test
    fun test3() {
        val nums: IntArray = intArrayOf(1, 2, 3, 1, 2, 3)
        val k = 2
        assertFalse { solution.containsNearbyDuplicate(nums, k) }
    }

    @Test
    fun test4() {
        val nums: IntArray = intArrayOf(1)
        val k = 0
        assertFalse { solution.containsNearbyDuplicate(nums, k) }
    }

    @Test
    fun test5() {
        val nums: IntArray = intArrayOf(1, 1)
        val k = 0
        assertFalse { solution.containsNearbyDuplicate(nums, k) }
    }

    @Test
    fun test6() {
        val nums: IntArray = intArrayOf(1, 2, 0, 0, 3, 1)
        val k = 4
        assertTrue { solution.containsNearbyDuplicate(nums, k) }
    }
}