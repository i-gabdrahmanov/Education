package ru.arc.leetcode.sudoku;

import java.util.HashSet;
import java.util.Set;

public class Sudoku {
    public static void main(String[] args) {
        char[][] boardTrue =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] boardFalse =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '7', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(boardFalse));

    }

    public static boolean isValidSudoku(char[][] chars) {
        Set<String> checked = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = chars[i][j];
                if (number != '.') {
                    if (!checked.add(number + " in row " + i)
                            || !checked.add(number + " in col " + j)) {
                        System.out.println("Problem in " + i + "-" + j + " position");
                        return false;
                    } else if (!checked.add(number + " block " + i / 3 + "-" + j / 3)) {
                        System.out.println("Problem in block " + i / 3 + "-" + j / 3 + " position");
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
