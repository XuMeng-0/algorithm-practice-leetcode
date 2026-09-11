package com.github.xumeng.java.problems.medium.problem0062;

public class Solution0062 {

    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        if (m == 2) {
            return n;
        }
        if (n == 2) {
            return m;
        }
        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
    }

}
