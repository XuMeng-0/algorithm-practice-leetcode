package com.github.xumeng.java.problems.medium.problem0073;

import java.util.HashSet;
import java.util.Set;

public class Solution0073 {

    public void setZeroes(int[][] matrix) {
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    xSet.add(j);
                    ySet.add(i);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (xSet.contains(j)) {
                    matrix[i][j] = 0;
                }
                if (ySet.contains(i)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
