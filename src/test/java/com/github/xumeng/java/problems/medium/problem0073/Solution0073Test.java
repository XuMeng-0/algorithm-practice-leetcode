package com.github.xumeng.java.problems.medium.problem0073;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0073Test {

    private final Solution0073 solution = new Solution0073();

    @Test
    public void test1() {
        int[] array1 = {1, 1, 1};
        int[] array2 = {1, 0, 1};
        int[] array3 = {1, 1, 1};
        int[][] matrix = {array1, array2, array3};
        solution.setZeroes(matrix);
        int[] arrayA = {1, 0, 1};
        int[] arrayB = {0, 0, 0};
        int[] arrayC = {1, 0, 1};
        assertArrayEquals(arrayA, array1);
        assertArrayEquals(arrayB, array2);
        assertArrayEquals(arrayC, array3);
    }

    @Test
    public void test2() {
        int[] array1 = {0, 1, 2, 0};
        int[] array2 = {3, 4, 5, 2};
        int[] array3 = {1, 3, 1, 5};
        int[][] matrix = {array1, array2, array3};
        solution.setZeroes(matrix);
        int[] arrayA = {0, 0, 0, 0};
        int[] arrayB = {0, 4, 5, 0};
        int[] arrayC = {0, 3, 1, 0};
        assertArrayEquals(arrayA, array1);
        assertArrayEquals(arrayB, array2);
        assertArrayEquals(arrayC, array3);
    }

    @Test
    public void test3() {
        int[] array1 = {0};
        int[][] matrix = {array1};
        solution.setZeroes(matrix);
        int[] arrayA = {0};
        assertArrayEquals(arrayA, array1);
    }

    @Test
    public void test4() {
        int[] array1 = {1};
        int[][] matrix = {array1};
        solution.setZeroes(matrix);
        int[] arrayA = {1};
        assertArrayEquals(arrayA, array1);
    }

    @Test
    public void test5() {
        int[] array1 = {1, 0};
        int[] array2 = {1, 1};
        int[][] matrix = {array1, array2};
        solution.setZeroes(matrix);
        int[] arrayA = {0, 0};
        int[] arrayB = {1, 0};
        assertArrayEquals(arrayA, array1);
        assertArrayEquals(arrayB, array2);
    }

}