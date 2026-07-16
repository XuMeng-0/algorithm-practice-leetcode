package com.github.xumeng.kotlin.problems.easy.problem0231

import kotlin.math.pow

class Solution0231S1 {

    fun isPowerOfTwo(n: Int): Boolean {
        if (n <= 0) {
            return false
        }
        for (i in 0..<32) {
            val power = 2.0.pow(i)
            if (power == n.toDouble()) {
                return true
            }
            if (power > n) {
                return false
            }
        }
        return false
    }

}