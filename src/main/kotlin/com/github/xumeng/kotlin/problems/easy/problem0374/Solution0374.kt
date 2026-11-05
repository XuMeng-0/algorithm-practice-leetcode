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
        var min = 1
        var max: Int = n
        var middle: Int
        var result: Int
        do {
            middle = (min + (max - min) / 2)
            result = guess(middle)
            if (result == 0) {
                return middle
            }
            if (result < 0) {
                max = middle - 1
            }
            if (result > 0) {
                min = middle + 1
            }
        } while (min < max)
        return min
    }

}