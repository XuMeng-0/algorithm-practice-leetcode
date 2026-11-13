package com.github.xumeng.kotlin.problems.medium.problem0078

class Solution0078 {

    fun subsets(nums: IntArray): List<List<Int>> {
        val subsets: MutableList<List<Int>> = mutableListOf()
        val n = nums.size
        subsets.add(listOf())
        for (i in 1..n) {
            subsets.addAll(combine(nums, i))
        }
        return subsets
    }

    private fun combine(nums: IntArray, k: Int): List<List<Int>> {
        val combinations: MutableList<MutableList<Int>> = mutableListOf()
        val n = nums.size
        if (n == k) {
            combinations.addAll(listOf(nums.toMutableList()))
            return combinations
        }
        if (k == 1) {
            nums.forEach { num -> combinations.add(mutableListOf(num)) }
            return combinations
        }
        val numsWithoutLast: IntArray = nums.copyOfRange(0, n - 1)
        val part1: List<MutableList<Int>> = combine(numsWithoutLast, k).map { origin ->
            origin.toMutableList()
        }
        combinations.addAll(part1)
        val part2: List<MutableList<Int>> = combine(numsWithoutLast, k - 1).map { origin ->
            val combination = origin.toMutableList()
            combination.add(nums[n - 1])
            combination
        }
        combinations.addAll(part2)
        return combinations
    }

}