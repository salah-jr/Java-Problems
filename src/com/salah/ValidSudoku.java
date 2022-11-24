package com.salah;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean validRows = isValidRows(board);
        boolean validCols = isValidCols(board);
        boolean validBoxes = isValidBoxes(board);

        return validRows && validCols && validBoxes;
    }

    private boolean isValidBoxes(char[][] board) {
        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                for (int i = 0; i < 8; i++) {
                    for (int j = i + 1; j < 9; j++) {

                        if (board[r + i % 3][c + i / 3] == '.' || board[r + j % 3][c + j / 3] == '.') {
                            continue;
                        }

                        if (board[r + i % 3][c + i / 3] == board[r + j % 3][c + j / 3]) return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean isValidCols(char[][] board) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[j][i] == '.') {
                    continue;
                }

                if (set.contains(board[j][i])) {
                    return false;
                }

                set.add(board[j][i]);
            }

            set.clear();
        }

        return true;
    }

    private boolean isValidRows(char[][] board) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                if (set.contains(board[i][j])) {
                    return false;
                }

                set.add(board[i][j]);
            }

            set.clear();
        }

        return true;
    }
}
