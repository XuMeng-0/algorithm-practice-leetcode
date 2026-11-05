package com.github.xumeng.kotlin.problems.medium.problem0074

class Solution0074 {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (target < matrix[0][0]) {
            return false
        }
        val row = findRow(matrix, target)
        if (row == -1) {
            return false
        }
        val column = findColumn(matrix[row], target)
        return column != -1
    }

    private fun findRow(matrix: Array<IntArray>, target: Int): Int {
        if (matrix.size == 1) {
            return 0
        }
        if (target >= matrix[matrix.size - 1][0]) {
            return matrix.size - 1
        }
        var middle: Int
        var i = 0
        var j = matrix.size - 1
        while (i < j) {
            middle = i + (j - i) / 2
            if (matrix[middle][0] == target) {
                return middle
            }
            if (matrix[middle][0] < target) {
                i = middle
            }
            if (matrix[i][0] < target && target < matrix[i + 1][0]) {
                return i
            }
            if (matrix[middle][0] > target) {
                j = middle
            }
            if (matrix[j - 1][0] < target && target < matrix[j][0]) {
                return j - 1
            }
        }
        return -1
    }

    private fun findColumn(array: IntArray, target: Int): Int {
        var middle: Int
        var i = 0
        var j = array.size - 1
        while (i < j) {
            middle = i + (j - i) / 2
            if (array[middle] == target) {
                return middle
            }
            if (array[middle] < target) {
                i = middle + 1
            }
            if (array[middle] > target) {
                j = middle - 1
            }
        }
        if (array[i] == target) {
            return i
        }
        return -1
    }

}