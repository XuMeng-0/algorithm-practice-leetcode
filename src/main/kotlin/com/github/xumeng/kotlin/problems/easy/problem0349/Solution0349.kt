package com.github.xumeng.kotlin.problems.easy.problem0349

class Solution0349 {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val intersection = mutableListOf<Int>()
        for (i in nums1.indices) {
            val num = nums1[i]
            if (!nums2.contains(num)) {
                continue
            }
            if (!intersection.contains(num)) {
                intersection.add(num)
            }
        }
        return intersection.toIntArray()
    }

}