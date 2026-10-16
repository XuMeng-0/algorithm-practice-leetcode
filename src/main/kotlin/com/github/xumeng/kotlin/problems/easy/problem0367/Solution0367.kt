package com.github.xumeng.kotlin.problems.easy.problem0367

class Solution0367 {

    fun isPerfectSquare(num: Int): Boolean {
        var product: Long = 0
        var i = 0
        while (product < Int.MAX_VALUE) {
            i++
            product = i.toLong() * i.toLong()
            if (num.toLong() == product) {
                return true
            }
            if (num < product) {
                return false
            }
        }
        return false
    }

}