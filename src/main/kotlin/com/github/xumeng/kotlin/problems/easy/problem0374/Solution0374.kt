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
        var lastMiddle = 0
        var result: Int
        var start: Long = 1
        var end: Long = n.toLong()
        do {
            middle = ((start + end) / 2).toInt()
            result = guess(middle)
            if (result < 0) {
                start = min.toLong()
                end = middle.toLong()
                max = middle
            }
            if (result > 0) {
                start = middle.toLong()
                end = max.toLong()
                min = middle
            }
            if (lastMiddle == middle) {
                break
            }
            lastMiddle = middle
        } while (result != 0)
        if (result == 0) {
            return middle
        }
        return max
    }

}