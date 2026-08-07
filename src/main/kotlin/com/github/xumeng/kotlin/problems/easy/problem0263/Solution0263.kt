package com.github.xumeng.kotlin.problems.easy.problem0263

class Solution0263 {

    fun isUgly(n: Int): Boolean {
        if (n <= 0) {
            return false
        }
        var quotient: Int = n
        var i = 1
        while (i <= quotient) {
            quotient = n / i
            if (n % i != 0) {
                i++
                continue
            }
            if (isPrime(i) && i > 5) {
                return false
            }
            if (isPrime(quotient) && quotient > 5) {
                return false
            }
            i++
        }
        return true
    }

    private fun isPrime(n: Int): Boolean {
        var i = 2
        while (i <= n / i) {
            if (n % i == 0) {
                return false
            }
            i++
        }
        return true
    }

}