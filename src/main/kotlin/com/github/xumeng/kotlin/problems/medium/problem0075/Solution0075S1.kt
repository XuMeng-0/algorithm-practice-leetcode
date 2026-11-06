package com.github.xumeng.kotlin.problems.medium.problem0075

// 选择排序
class Solution0075S1 {

    fun sortColors(nums: IntArray) {
        var i = 0
        var temp: Int
        var minPosition: Int
        while (i < nums.size) {
            var j = i + 1
            minPosition = i
            while (j < nums.size) {
                if (nums[minPosition] > nums[j]) {
                    minPosition = j
                }
                j++
            }
            temp = nums[minPosition]
            nums[minPosition] = nums[i]
            nums[i] = temp
            i++
        }
    }

}