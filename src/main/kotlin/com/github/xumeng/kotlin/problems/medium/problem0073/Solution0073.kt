package com.github.xumeng.kotlin.problems.medium.problem0073

class Solution0073 {

    fun setZeroes(matrix: Array<IntArray>): Unit {
        val xSet = mutableSetOf<Int>()
        val ySet = mutableSetOf<Int>()
        for (i in matrix.indices) {
            val array = matrix[i]
            for (j in array.indices) {
                if (matrix[i][j] == 0) {
                    xSet.add(j)
                    ySet.add(i)
                }
            }
        }
        for (i in matrix.indices) {
            val array = matrix[i]
            for (j in array.indices) {
                if (xSet.contains(j)) {
                    matrix[i][j] = 0
                }
                if (ySet.contains(i)) {
                    matrix[i][j] = 0
                }
            }
        }
    }

}