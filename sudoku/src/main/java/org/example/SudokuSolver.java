package org.example;

import java.util.Arrays;

public class SudokuSolver {

    public void solveSudoku(char[][] board) {
        char[][] originalBoard = Arrays.stream(board).map(char[]::clone).toArray($ -> board.clone());

        for (int i = 0; i < board.length; i++) {
            char[] row = board[i];
            for (int j = 0; j < row.length; j++) {
                if (originalBoard[i][j] == '.') {
                    for (int k = 1; k < 11; k++) {
                        if (!numberExistsInRow(row, k) && !numberExistsInColumn(j, k)) {
                            row[j] = Character.forDigit(k, 10);
                            break;
                        }

                    }



                }

            }
        }

    }

    private boolean numberExistsInRow(char[] row, int number) {
        char num = Character.forDigit(number, 10);
        for (char c : row) {
            if (c == num) {
                return true;
            }
        }
        return false;
    }

    private boolean numberExistsInColumn(int column, int number) {
        return false;
    }

    private boolean numberExistsInSubBox(int x, int y, int number) {
        return false;
    }
}
