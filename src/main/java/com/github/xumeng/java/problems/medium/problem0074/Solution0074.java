package com.github.xumeng.java.problems.medium.problem0074;

public class Solution0074 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int[] array = new int[matrix.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = matrix[i][0];
        }
        int row = findRow(array, target);
        if (row == -1) {
            return false;
        }
        int column = findColumn(matrix[row], target);
        return column != -1;
    }

    private int findRow(int[] array, int target) {
        if (array.length == 1) {
            return 0;
        }
        if (target < array[0]) {
            return -1;
        }
        if (target > array[array.length - 1]) {
            return array.length - 1;
        }
        int middle;
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            middle = i + (j - i) / 2;
            if (array[middle] == target) {
                return middle;
            }
            if (array[middle] < target) {
                i = middle;
            }
            if (array[i] < target && target < array[i + 1]) {
                return i;
            }
            if (array[middle] > target) {
                j = middle;
            }
            if (array[j - 1] < target && target < array[j]) {
                return j;
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
