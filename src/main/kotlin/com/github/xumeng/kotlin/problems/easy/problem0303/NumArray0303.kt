package com.github.xumeng.kotlin.problems.easy.problem0303

class NumArray0303(nums: IntArray) {

    private var numArray = nums

    fun sumRange(left: Int, right: Int): Int {
        var sum = 0
        for (i in left..right) {
            sum += numArray[i]
        }
        return sum
    }

}