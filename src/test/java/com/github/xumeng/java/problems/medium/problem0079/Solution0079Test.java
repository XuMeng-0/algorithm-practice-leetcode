package com.github.xumeng.java.problems.medium.problem0079;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0079Test {

    private final Solution0079 solution = new Solution0079();

    @Test
    public void test11() {
        char[] row1 = {'A', 'B', 'C', 'E'};
        char[] row2 = {'S', 'F', 'C', 'S'};
        char[] row3 = {'A', 'D', 'E', 'E'};
        char[][] board = {row1, row2, row3};
        String word = "ABCCED";
        boolean existent = solution.exist(board, word);
        assertTrue(existent);
    }

    @Test
    public void test12() {
        char[] row1 = {'A', 'B', 'C', 'E'};
        char[] row2 = {'S', 'F', 'C', 'S'};
        char[] row3 = {'A', 'D', 'E', 'E'};
        char[][] board = {row1, row2, row3};
        String word = "SEE";
        boolean existent = solution.exist(board, word);
        assertTrue(existent);
    }

    @Test
    public void test13() {
        char[] row1 = {'A', 'B', 'C', 'E'};
        char[] row2 = {'S', 'F', 'C', 'S'};
        char[] row3 = {'A', 'D', 'E', 'E'};
        char[][] board = {row1, row2, row3};
        String word = "ABCB";
        boolean existent = solution.exist(board, word);
        assertFalse(existent);
    }

    @Test
    public void test21() {
        char[] row1 = {'A'};
        char[][] board = {row1};
        String word = "A";
        boolean existent = solution.exist(board, word);
        assertTrue(existent);
    }

    @Test
    public void test22() {
        char[] row1 = {'A'};
        char[][] board = {row1};
        String word = "B";
        boolean existent = solution.exist(board, word);
        assertFalse(existent);
    }

    @Test
    public void test31() {
        char[] row1 = {'A'};
        char[][] board = {row1};
        String word = "a";
        boolean existent = solution.exist(board, word);
        assertFalse(existent);
    }

    @Test
    public void test41() {
        char[] row1 = {'A', 'B', 'C', 'E'};
        char[] row2 = {'S', 'F', 'C', 'S'};
        char[] row3 = {'A', 'D', 'E', 'E'};
        char[][] board = {row1, row2, row3};
        String word = "FSAE";
        boolean existent = solution.exist(board, word);
        assertFalse(existent);
    }

    @Test
    public void test42() {
        char[] row1 = {'A', 'B', 'C', 'E'};
        char[] row2 = {'S', 'F', 'C', 'S'};
        char[] row3 = {'A', 'D', 'E', 'E'};
        char[][] board = {row1, row2, row3};
        String word = "CSEC";
        boolean existent = solution.exist(board, word);
        assertTrue(existent);
    }

}