package com.github.xumeng.kotlin.problems.easy.problem0283

class Solution0283S2 {

    fun moveZeroes(nums: IntArray) {
        val length: Int = nums.size
        var temp: Int
        for (i in 0..<length) {
            for (j in 0..<length - 1 - i) {
                if (nums[j] != 0) {
                    continue
                }
                if (nums[j + 1] == 0) {
                    continue
                }
                temp = nums[j + 1]
                nums[j + 1] = nums[j]
                nums[j] = temp
            }
        }
    }

}