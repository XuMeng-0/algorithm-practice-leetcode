package com.github.xumeng.kotlin.problems.easy.problem0231

class Solution0231S2 {

    fun isPowerOfTwo(n: Int): Boolean {
        if (n <= 0) {
            return false
        }
        var number = n
        var countOfOne = 0
        var quotient = number / 2
        while (quotient > 0) {
            quotient = number / 2
            if (number % 2 == 1) {
                countOfOne++
            }
            if (countOfOne > 1) {
                return false
            }
            number = quotient
        }
        return true
    }

}