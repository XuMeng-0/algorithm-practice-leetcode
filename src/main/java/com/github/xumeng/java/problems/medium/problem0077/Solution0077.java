package com.github.xumeng.java.problems.medium.problem0077;

import java.util.ArrayList;
import java.util.List;

public class Solution0077 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        if (n == k) {
            List<Integer> combination = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                combination.add(i + 1);
            }
            combinations.add(combination);
            return combinations;
        }
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                List<Integer> combination = new ArrayList<>();
                combination.add(i + 1);
                combinations.add(combination);
            }
            return combinations;
        }
        combinations.addAll(combine(n - 1, k));
        List<List<Integer>> part = combine(n - 1, k - 1);
        for (List<Integer> combination : part) {
            combination.add(n);
            combinations.add(combination);
        }
        return combinations;
    }

}
