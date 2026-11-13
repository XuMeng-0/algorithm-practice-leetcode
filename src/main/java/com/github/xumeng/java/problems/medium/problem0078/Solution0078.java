package com.github.xumeng.java.problems.medium.problem0078;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0078 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int n = nums.length;
        subsets.add(List.of());
        for (int i = 1; i <= n; i++) {
            subsets.addAll(combine(nums, i));
        }
        return subsets;
    }

    private List<List<Integer>> combine(int[] nums, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        int n = nums.length;
        if (n == k) {
            List<Integer> combination = new ArrayList<>();
            for (int num : nums) {
                combination.add(num);
            }
            combinations.add(combination);
            return combinations;
        }
        if (k == 1) {
            for (int num : nums) {
                List<Integer> combination = new ArrayList<>();
                combination.add(num);
                combinations.add(combination);
            }
            return combinations;
        }
        int[] numsWithoutLast = Arrays.copyOfRange(nums, 0, n - 1);
        List<List<Integer>> part1 = combine(numsWithoutLast, k);
        combinations.addAll(part1);
        List<List<Integer>> part2 = combine(numsWithoutLast, k - 1);
        for (List<Integer> combination : part2) {
            combination.add(nums[n - 1]);
        }
        combinations.addAll(part2);
        return combinations;
    }

}
