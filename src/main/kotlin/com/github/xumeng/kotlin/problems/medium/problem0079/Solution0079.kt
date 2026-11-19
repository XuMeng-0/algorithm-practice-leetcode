package com.github.xumeng.kotlin.problems.medium.problem0079

class Solution0079 {

    fun exist(board: Array<CharArray>, word: String): Boolean {
        val character = word[0]
        val positions: List<IntArray> = findFirstCharacter(board, character)
        for (position: IntArray in positions) {
            val cleanBoard: Array<CharArray> = cloneBoard(board)
            if (exist(cleanBoard, word.substring(1), position)) {
                return true
            }
        }
        return false
    }

    private fun findFirstCharacter(board: Array<CharArray>, character: Char): List<IntArray> {
        val positions: MutableList<IntArray> = mutableListOf()
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == character) {
                    val position = intArrayOf(i, j)
                    positions.add(position)
                }
            }
        }
        return positions
    }

    private fun cloneBoard(board: Array<CharArray>): Array<CharArray> {
        val cleanBoard: Array<CharArray> = Array(board.size) { i ->
            CharArray(board[i].size) { j ->
                board[i][j]
            }
        }
        return cleanBoard
    }

    private fun exist(board: Array<CharArray>, word: String, lastPosition: IntArray): Boolean {
        if (word.isEmpty()) {
            return true
        }
        val x = lastPosition[0]
        val y = lastPosition[1]
        board[x][y] = '.'
        val character = word[0]
        val positions: List<IntArray> = findCharacter(board, character, lastPosition)
        if (positions.isEmpty()) {
            return false
        }
        for (position: IntArray in positions) {
            val cleanBoard: Array<CharArray> = cloneBoard(board)
            if (exist(cleanBoard, word.substring(1), position)) {
                return true
            }
        }
        return false
    }

    private fun findCharacter(board: Array<CharArray>, character: Char, lastPosition: IntArray): List<IntArray> {
        val i = lastPosition[0]
        val j = lastPosition[1]
        val positions: MutableList<IntArray> = mutableListOf()
        if (j - 1 >= 0) {
            if (character == board[i][j - 1]) {
                val position = intArrayOf(i, j - 1)
                positions.add(position)
            }
        }
        if (j + 1 < board[i].size) {
            if (character == board[i][j + 1]) {
                val position = intArrayOf(i, j + 1)
                positions.add(position)
            }
        }
        if (i - 1 >= 0) {
            if (character == board[i - 1][j]) {
                val position = intArrayOf(i - 1, j)
                positions.add(position)
            }
        }
        if (i + 1 < board.size) {
            if (character == board[i + 1][j]) {
                val position = intArrayOf(i + 1, j)
                positions.add(position)
            }
        }
        return positions
    }

}