package com.github.xumeng.kotlin.problems.medium.problem0074

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0074Test {

    private val solution = Solution0074()

    @Test
    fun test01() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = 3
        val existent = solution.searchMatrix(matrix, target)
        assertTrue(existent)
    }

    @Test
    fun test02() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = 13
        val existent = solution.searchMatrix(matrix, target)
        assertFalse(existent)
    }

    @Test
    fun test03() {
        val array1 = intArrayOf(1)
        val matrix = arrayOf(array1)
        val target = 1
        val existent = solution.searchMatrix(matrix, target)
        assertTrue(existent)
    }

    @Test
    fun test04() {
        val array1 = intArrayOf(1)
        val matrix = arrayOf(array1)
        val target = 3
        val existent = solution.searchMatrix(matrix, target)
        assertFalse(existent)
    }

    @Test
    fun test05() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = 11
        val existent = solution.searchMatrix(matrix, target)
        assertTrue(existent)
    }

    @Test
    fun test06() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = 9
        val existent = solution.searchMatrix(matrix, target)
        assertFalse(existent)
    }

    @Test
    fun test07() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = 21
        val existent = solution.searchMatrix(matrix, target)
        assertFalse(existent)
    }

    @Test
    fun test08() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = 60
        val existent = solution.searchMatrix(matrix, target)
        assertTrue(existent)
    }

    @Test
    fun test09() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = 90
        val existent = solution.searchMatrix(matrix, target)
        assertFalse(existent)
    }

    @Test
    fun test10() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = 1
        val existent = solution.searchMatrix(matrix, target)
        assertTrue(existent)
    }

    @Test
    fun test11() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = -1
        val existent = solution.searchMatrix(matrix, target)
        assertFalse(existent)
    }

    @Test
    fun test12() {
        val array1 = intArrayOf(1, 3, 5, 7)
        val array2 = intArrayOf(10, 11, 16, 20)
        val array3 = intArrayOf(23, 30, 34, 60)
        val matrix = arrayOf(array1, array2, array3)
        val target = 23
        val existent = solution.searchMatrix(matrix, target)
        assertTrue(existent)
    }

}