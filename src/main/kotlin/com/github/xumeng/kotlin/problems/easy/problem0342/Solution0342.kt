package com.github.xumeng.kotlin.problems.easy.problem0342

import kotlin.math.pow

class Solution0342 {

    fun isPowerOfFour(n: Int): Boolean {
        if (n < 1) {
            return false
        }
        var powerOfFour = 0.0
        var i = 0
        val base = 4.0
        while (powerOfFour < Int.MAX_VALUE) {
            powerOfFour = base.pow(i)
            if (n.toDouble() == powerOfFour) {
                return true
            }
            if (n < powerOfFour) {
                return false
            }
            i++
        }
        return false
    }

}