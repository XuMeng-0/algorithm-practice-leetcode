package com.github.xumeng.kotlin.problems.easy.problem0283

class Solution0283S1 {

    fun moveZeroes(nums: IntArray) {
        val length: Int = nums.size
        var temp: Int
        for (i in 0..<length) {
            for (j in i + 1..<length) {
                if (nums[i] != 0) {
                    continue
                }
                if (nums[j] == 0) {
                    continue
                }
                temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
            }
        }
    }

}