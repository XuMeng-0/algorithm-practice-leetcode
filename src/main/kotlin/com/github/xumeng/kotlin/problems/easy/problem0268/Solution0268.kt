package com.github.xumeng.kotlin.problems.easy.problem0268

class Solution0268 {

    fun missingNumber(nums: IntArray): Int {
        nums.sort()
        if (nums[0] != 0) {
            return 0
        }
        for (i in 0..<nums.size - 1) {
            if (nums[i + 1] - nums[i] != 1) {
                return nums[i] + 1
            }
        }
        return nums.size
    }

}