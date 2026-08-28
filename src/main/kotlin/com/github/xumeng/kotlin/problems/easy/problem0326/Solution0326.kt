package com.github.xumeng.kotlin.problems.easy.problem0326

import kotlin.math.pow

class Solution0326 {

    fun isPowerOfThree(n: Int): Boolean {
        if (n < 1) {
            return false
        }
        val base = 3.0
        var i = 0
        var power = base.pow(i)
        while (power <= Int.MAX_VALUE) {
            if (n == power.toInt()) {
                return true
            }
            if (n < power) {
                return false
            }
            i++
            power = base.pow(i)
        }
        return false
    }

}