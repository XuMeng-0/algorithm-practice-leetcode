package com.github.xumeng.kotlin.problems.medium.problem0080

class Solution0080 {

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 2) {
            return nums.size
        }
        var size = nums.size
        while (true) {
            var duplicateCount = 0
            var lastNumber = nums[0]
            var i = 1
            var sizeChanged = false
            while (i < size) {
                if (sizeChanged) {
                    nums[i - 1] = nums[i]
                } else {
                    if (nums[i] == lastNumber) {
                        duplicateCount++
                        if (duplicateCount == 2) {
                            sizeChanged = true
                        }
                    } else {
                        duplicateCount = 0
                    }
                    lastNumber = nums[i]
                }
                i++
            }
            if (sizeChanged) {
                size--
            } else {
                break
            }
        }
        return size
    }

}