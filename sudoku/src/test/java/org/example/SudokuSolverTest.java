package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SudokuSolverTest {

    private static SudokuSolver sudokuSolver;

    @BeforeAll
    public static void setUp() {
        sudokuSolver = new SudokuSolver();
    }

    @Test
    public void test1() {
        char[][] input = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        char[][] original = Arrays.stream(input).map(char[]::clone).toArray($ -> input.clone());
        char[][] expected = {{'5','3','4','6','7','8','9','1','2'},{'6','7','2','1','9','5','3','4','8'},{'1','9','8','3','4','2','5','6','7'},{'8','5','9','7','6','1','4','2','3'},{'4','2','6','8','5','3','7','9','1'},{'7','1','3','9','2','4','8','5','6'},{'9','6','1','5','3','7','2','8','4'},{'2','8','7','4','1','9','6','3','5'},{'3','4','5','2','8','6','1','7','9'}};
        sudokuSolver.solveSudoku(input);
        System.out.println("original\n" + Arrays.deepToString(original));
        System.out.println("input\n" + Arrays.deepToString(input));
        System.out.println("expected\n" + Arrays.deepToString(expected));
        assertEquals(expected, input);
    }

}