package com.github.xumeng.kotlin.problems.easy.problem0338

class Solution0338 {

    fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1)
        for (i in 0..n) {
            result[i] = countNumberOfOne(i)
        }
        return result
    }

    private fun countNumberOfOne(n: Int): Int {
        var dividend: Int = n
        var quotient: Int
        var countOfOne = 0
        while (dividend != 0) {
            quotient = dividend / 2
            if (dividend % 2 == 1) {
                countOfOne++
            }
            dividend = quotient
        }
        return countOfOne
    }

}