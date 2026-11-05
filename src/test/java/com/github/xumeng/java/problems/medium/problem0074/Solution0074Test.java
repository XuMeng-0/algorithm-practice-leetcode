package com.github.xumeng.java.problems.medium.problem0074;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0074Test {

    private final Solution0074 solution = new Solution0074();

    @Test
    public void test1() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {10, 11, 16, 20};
        int[] array3 = {23, 30, 34, 60};
        int[][] matrix = {array1, array2, array3};
        int target = 3;
        boolean existent = solution.searchMatrix(matrix, target);
        assertTrue(existent);
    }

    @Test
    public void test2() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {10, 11, 16, 20};
        int[] array3 = {23, 30, 34, 60};
        int[][] matrix = {array1, array2, array3};
        int target = 13;
        boolean existent = solution.searchMatrix(matrix, target);
        assertFalse(existent);
    }

    @Test
    public void test3() {
        int[] array1 = {1};
        int[][] matrix = {array1};
        int target = 1;
        boolean existent = solution.searchMatrix(matrix, target);
        assertTrue(existent);
    }

    @Test
    public void test4() {
        int[] array1 = {1};
        int[][] matrix = {array1};
        int target = 3;
        boolean existent = solution.searchMatrix(matrix, target);
        assertFalse(existent);
    }

    @Test
    public void test5() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {10, 11, 16, 20};
        int[] array3 = {23, 30, 34, 60};
        int[][] matrix = {array1, array2, array3};
        int target = 11;
        boolean existent = solution.searchMatrix(matrix, target);
        assertTrue(existent);
    }

    @Test
    public void test6() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {10, 11, 16, 20};
        int[] array3 = {23, 30, 34, 60};
        int[][] matrix = {array1, array2, array3};
        int target = 9;
        boolean existent = solution.searchMatrix(matrix, target);
        assertFalse(existent);
    }

    @Test
    public void test7() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {10, 11, 16, 20};
        int[] array3 = {23, 30, 34, 60};
        int[][] matrix = {array1, array2, array3};
        int target = 21;
        boolean existent = solution.searchMatrix(matrix, target);
        assertFalse(existent);
    }

    @Test
    public void test8() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {10, 11, 16, 20};
        int[] array3 = {23, 30, 34, 60};
        int[][] matrix = {array1, array2, array3};
        int target = 60;
        boolean existent = solution.searchMatrix(matrix, target);
        assertTrue(existent);
    }

    @Test
    public void test9() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {10, 11, 16, 20};
        int[] array3 = {23, 30, 34, 60};
        int[][] matrix = {array1, array2, array3};
        int target = 90;
        boolean existent = solution.searchMatrix(matrix, target);
        assertFalse(existent);
    }

    @Test
    public void test10() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {10, 11, 16, 20};
        int[] array3 = {23, 30, 34, 60};
        int[][] matrix = {array1, array2, array3};
        int target = 1;
        boolean existent = solution.searchMatrix(matrix, target);
        assertTrue(existent);
    }

    @Test
    public void test11() {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {10, 11, 16, 20};
        int[] array3 = {23, 30, 34, 60};
        int[][] matrix = {array1, array2, array3};
        int target = -1;
        boolean existent = solution.searchMatrix(matrix, target);
        assertFalse(existent);
    }

}