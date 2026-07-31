package com.github.xumeng.kotlin.problems.easy.problem0258

import kotlin.math.pow

class Solution0258 {

    fun addDigits(num: Int): Int {
        if (num < 10) {
            return num
        }
        var number = num
        var index = 9
        var divisor: Int
        var quotient: Byte
        var sum = 0
        while (index >= 0) {
            divisor = 10.0.pow(index).toInt()
            quotient = (number / divisor).toByte()
            sum += quotient
            number %= divisor
            index--
        }
        while (sum > 9) {
            sum = addDigits(sum)
        }
        return sum
    }

}