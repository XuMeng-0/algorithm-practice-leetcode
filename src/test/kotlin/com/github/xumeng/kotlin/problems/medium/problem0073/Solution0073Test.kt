package com.github.xumeng.kotlin.problems.medium.problem0073

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0073Test {

    private val solution = Solution0073()

    @Test
    fun test1() {
        val array1 = intArrayOf(1, 1, 1)
        val array2 = intArrayOf(1, 0, 1)
        val array3 = intArrayOf(1, 1, 1)
        val matrix = arrayOf(array1, array2, array3)
        solution.setZeroes(matrix)
        val arrayA = intArrayOf(1, 0, 1)
        val arrayB = intArrayOf(0, 0, 0)
        val arrayC = intArrayOf(1, 0, 1)
        assertArrayEquals(arrayA, array1)
        assertArrayEquals(arrayB, array2)
        assertArrayEquals(arrayC, array3)
    }

    @Test
    fun test2() {
        val array1 = intArrayOf(0, 1, 2, 0)
        val array2 = intArrayOf(3, 4, 5, 2)
        val array3 = intArrayOf(1, 3, 1, 5)
        val matrix = arrayOf(array1, array2, array3)
        solution.setZeroes(matrix)
        val arrayA = intArrayOf(0, 0, 0, 0)
        val arrayB = intArrayOf(0, 4, 5, 0)
        val arrayC = intArrayOf(0, 3, 1, 0)
        assertArrayEquals(arrayA, array1)
        assertArrayEquals(arrayB, array2)
        assertArrayEquals(arrayC, array3)
    }

    @Test
    fun test3() {
        val array1 = intArrayOf(0)
        val matrix = arrayOf(array1)
        solution.setZeroes(matrix)
        val arrayA = intArrayOf(0)
        assertArrayEquals(arrayA, array1)
    }

    @Test
    fun test4() {
        val array1 = intArrayOf(1)
        val matrix = arrayOf(array1)
        solution.setZeroes(matrix)
        val arrayA = intArrayOf(1)
        assertArrayEquals(arrayA, array1)
    }

    @Test
    fun test5() {
        val array1 = intArrayOf(1, 0)
        val array2 = intArrayOf(1, 1)
        val matrix = arrayOf(array1, array2)
        solution.setZeroes(matrix)
        val arrayA = intArrayOf(0, 0)
        val arrayB = intArrayOf(1, 0)
        assertArrayEquals(arrayA, array1)
        assertArrayEquals(arrayB, array2)
    }

}