package com.github.xumeng.kotlin.problems.medium.problem0075

class Solution0075S2 {

    fun sortColors(nums: IntArray) {
        var i = nums.size
        var temp: Int
        while (i > 0) {
            var j = 0
            while (j + 1 < i) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1]
                    nums[j + 1] = nums[j]
                    nums[j] = temp
                }
                j++
            }
            i--
        }
    }

}