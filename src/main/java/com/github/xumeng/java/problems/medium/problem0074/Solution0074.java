package com.github.xumeng.java.problems.medium.problem0074;

public class Solution0074 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0]) {
            return false;
        }
        int row = findRow(matrix, target);
        if (row == -1) {
            return false;
        }
        int column = findColumn(matrix[row], target);
        return column != -1;
    }

    private int findRow(int[][] matrix, int target) {
        if (matrix.length == 1) {
            return 0;
        }
        if (target >= matrix[matrix.length - 1][0]) {
            return matrix.length - 1;
        }
        int middle;
        int i = 0;
        int j = matrix.length - 1;
        while (i < j) {
            middle = i + (j - i) / 2;
            if (matrix[middle][0] == target) {
                return middle;
            }
            if (matrix[middle][0] < target) {
                i = middle;
            }
            if (matrix[i][0] < target && target < matrix[i + 1][0]) {
                return i;
            }
            if (matrix[middle][0] > target) {
                j = middle;
            }
            if (matrix[j - 1][0] < target && target < matrix[j][0]) {
                return j - 1;
            }
        }
        return -1;
    }

    private int findColumn(int[] array, int target) {
        int middle;
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            middle = i + (j - i) / 2;
            if (array[middle] == target) {
                return middle;
            }
            if (array[middle] < target) {
                i = middle + 1;
            }
            if (array[middle] > target) {
                j = middle - 1;
            }
        }
        return array[i] == target ? i : -1;
    }

}
