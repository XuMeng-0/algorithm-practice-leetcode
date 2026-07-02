package com.github.xumeng.kotlin.problems.easy.problem0219

class SolutionKotlin0219 {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val numsLength: Int = nums.size
        for (i in 0 until numsLength) {
            val max: Int = (i + k).coerceAtMost(numsLength - 1)
            for (j in i + 1 until max + 1) {
                if (nums[i] == nums[j]) {
                    return true
                }
            }
        }
        return false
    }

}