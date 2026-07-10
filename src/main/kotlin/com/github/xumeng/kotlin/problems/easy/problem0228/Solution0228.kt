package com.github.xumeng.kotlin.problems.easy.problem0228

class Solution0228 {

    fun summaryRanges(nums: IntArray): List<String> {
        val result: MutableList<String> = mutableListOf()
        if (nums.isEmpty()) {
            return result
        }
        var start = 0
        var end = start
        while (end + 1 < nums.size) {
            if (nums[end] + 1 == nums[end + 1]) {
                end++
            } else {
                val element: String = if (start == end) {
                    nums[start].toString()
                } else {
                    nums[start].toString() + "->" + nums[end].toString()
                }
                result.add(element)
                start = end + 1
                end = start
            }
        }
        val element: String = if (start == end) {
            nums[start].toString()
        } else {
            nums[start].toString() + "->" + nums[end].toString()
        }
        result.add(element)
        return result
    }

}