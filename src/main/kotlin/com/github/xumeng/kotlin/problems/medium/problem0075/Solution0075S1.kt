package com.github.xumeng.kotlin.problems.medium.problem0075

// 选择排序
class Solution0075S1 {

    fun sortColors(nums: IntArray) {
        var i = 0
        var temp: Int
        while (i < nums.size) {
            var j = i + 1
            while (j < nums.size) {
                if (nums[i] > nums[j]) {
                    temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                }
                j++
            }
            i++
        }
    }

}