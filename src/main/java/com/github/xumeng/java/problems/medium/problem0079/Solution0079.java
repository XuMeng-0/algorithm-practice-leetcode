package com.github.xumeng.java.problems.medium.problem0079;

import java.util.ArrayList;
import java.util.List;

public class Solution0079 {

    public boolean exist(char[][] board, String word) {
        char character = word.charAt(0);
        List<int[]> positions = findFirstCharacter(board, character);
        for (int[] position : positions) {
            char[][] cleanBoard = cloneBoard(board);
            if (exist(cleanBoard, word.substring(1), position)) {
                return true;
            }
        }
        return false;
    }

    private char[][] cloneBoard(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        char[][] cleanBoard = new char[m][n];
        for (int i = 0; i < m; i++) {
            System.arraycopy(board[i], 0, cleanBoard[i], 0, n);
        }
        return cleanBoard;
    }

    private boolean exist(char[][] board, String word, int[] lastPosition) {
        if (word.isEmpty()) {
            return true;
        }
        int x = lastPosition[0];
        int y = lastPosition[1];
        board[x][y] = '.';
        char character = word.charAt(0);
        List<int[]> positions = findCharacter(board, character, lastPosition);
        if (positions.isEmpty()) {
            return false;
        }
        for (int[] position : positions) {
            if (exist(board, word.substring(1), position)) {
                return true;
            }
        }
        return false;
    }

    private List<int[]> findFirstCharacter(char[][] board, char character) {
        List<int[]> positions = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == character) {
                    int[] position = {i, j};
                    positions.add(position);
                }
            }
        }
        return positions;
    }

    private List<int[]> findCharacter(char[][] board, char character, int[] lastPosition) {
        int i = lastPosition[0];
        int j = lastPosition[1];
        List<int[]> positions = new ArrayList<>();
        if (j - 1 >= 0) {
            if (character == board[i][j - 1]) {
                int[] position = {i, j - 1};
                positions.add(position);
            }
        }
        if (j + 1 < board[i].length) {
            if (character == board[i][j + 1]) {
                int[] position = {i, j + 1};
                positions.add(position);
            }
        }
        if (i - 1 >= 0) {
            if (character == board[i - 1][j]) {
                int[] position = {i - 1, j};
                positions.add(position);
            }
        }
        if (i + 1 < board.length) {
            if (character == board[i + 1][j]) {
                int[] position = {i + 1, j};
                positions.add(position);
            }
        }
        return positions;
    }

}
