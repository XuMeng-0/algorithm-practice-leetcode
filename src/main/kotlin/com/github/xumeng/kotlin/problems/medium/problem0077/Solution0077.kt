package com.github.xumeng.kotlin.problems.medium.problem0077

class Solution0077 {

    fun combine(n: Int, k: Int): List<List<Int>> {
        val combinations: MutableList<MutableList<Int>> = mutableListOf()
        if (n == k) {
            val combination: MutableList<Int> = mutableListOf()
            for (i in 1..n) {
                combination.add(i)
            }
            combinations.add(combination)
            return combinations
        }
        if (k == 1) {
            for (i in 1..n) {
                val combination: MutableList<Int> = mutableListOf()
                combination.add(i)
                combinations.add(combination)
            }
            return combinations
        }
        val part1: List<MutableList<Int>> = combine(n - 1, k).map { origin ->
            origin.toMutableList()
        }
        combinations.addAll(part1)
        val part2: List<MutableList<Int>> = combine(n - 1, k - 1).map { origin ->
            val combination = origin.toMutableList()
            combination.add(n)
            combination
        }
        combinations.addAll(part2)
        return combinations
    }

}