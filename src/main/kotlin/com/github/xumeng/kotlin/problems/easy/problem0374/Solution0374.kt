package com.github.xumeng.kotlin.problems.easy.problem0374

class Solution0374 {

    private var number: Int = 0

    fun setNumber(number: Int) {
        this.number = number
    }

    private fun guess(num: Int): Int {
        if (num > this.number) {
            return -1
        }
        if (num < this.number) {
            return 1
        }
        return 0
    }

    fun guessNumber(n: Int): Int {
        return n
    }

}