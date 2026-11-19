package com.github.xumeng.kotlin.problems.medium.problem0079

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Solution0079Test {

    private val solution = Solution0079()

    @Test
    fun test11() {
        val row1 = charArrayOf('A', 'B', 'C', 'E')
        val row2 = charArrayOf('S', 'F', 'C', 'S')
        val row3 = charArrayOf('A', 'D', 'E', 'E')
        val board = arrayOf(row1, row2, row3)
        val word = "ABCCED"
        val existent = solution.exist(board, word)
        assertTrue(existent)
    }

    @Test
    fun test12() {
        val row1 = charArrayOf('A', 'B', 'C', 'E')
        val row2 = charArrayOf('S', 'F', 'C', 'S')
        val row3 = charArrayOf('A', 'D', 'E', 'E')
        val board = arrayOf(row1, row2, row3)
        val word = "SEE"
        val existent = solution.exist(board, word)
        assertTrue(existent)
    }

    @Test
    fun test13() {
        val row1 = charArrayOf('A', 'B', 'C', 'E')
        val row2 = charArrayOf('S', 'F', 'C', 'S')
        val row3 = charArrayOf('A', 'D', 'E', 'E')
        val board = arrayOf(row1, row2, row3)
        val word = "ABCB"
        val existent = solution.exist(board, word)
        assertFalse(existent)
    }

    @Test
    fun test21() {
        val row1 = charArrayOf('A')
        val board = arrayOf(row1)
        val word = "A"
        val existent = solution.exist(board, word)
        assertTrue(existent)
    }

    @Test
    fun test22() {
        val row1 = charArrayOf('A')
        val board = arrayOf(row1)
        val word = "B"
        val existent = solution.exist(board, word)
        assertFalse(existent)
    }

    @Test
    fun test31() {
        val row1 = charArrayOf('A')
        val board = arrayOf(row1)
        val word = "a"
        val existent = solution.exist(board, word)
        assertFalse(existent)
    }

    @Test
    fun test41() {
        val row1 = charArrayOf('A', 'B', 'C', 'E')
        val row2 = charArrayOf('S', 'F', 'C', 'S')
        val row3 = charArrayOf('A', 'D', 'E', 'E')
        val board = arrayOf(row1, row2, row3)
        val word = "FSAE"
        val existent = solution.exist(board, word)
        assertFalse(existent)
    }

    @Test
    fun test42() {
        val row1 = charArrayOf('A', 'B', 'C', 'E')
        val row2 = charArrayOf('S', 'F', 'C', 'S')
        val row3 = charArrayOf('A', 'D', 'E', 'E')
        val board = arrayOf(row1, row2, row3)
        val word = "CSEC"
        val existent = solution.exist(board, word)
        assertTrue(existent)
    }

    @Test
    fun test5() {
        val row1 = charArrayOf('A', 'B', 'C', 'E')
        val row2 = charArrayOf('S', 'F', 'E', 'S')
        val row3 = charArrayOf('A', 'D', 'E', 'E')
        val board = arrayOf(row1, row2, row3)
        val word = "ABCESEEEFS"
        val existent = solution.exist(board, word)
        assertTrue(existent)
    }
}