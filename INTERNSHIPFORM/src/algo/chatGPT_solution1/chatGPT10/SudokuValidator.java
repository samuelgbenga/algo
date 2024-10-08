package algo.chatGPT_solution1.chatGPT10;

import java.util.HashSet;

public class SudokuValidator {

    public boolean isValidSudoku(char[][] board) {
        // Initialize hash sets to keep track of digits in rows, columns, and boxes.
        HashSet<String> seen = new HashSet<>();

        // Traverse each cell in the Sudoku board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];

                // Only check if the current cell is not empty
                if (current != '.') {
                    // Prepare strings that represent the current number's row, column, and box
                    String rowCheck = "row" + i + current;
                    String colCheck = "col" + j + current;
                    String boxCheck = "box" + (i / 3) + (j / 3) + current;

                    // If any of these checks have already been seen, it means there's a duplicate
                    if (!seen.add(rowCheck) || !seen.add(colCheck) || !seen.add(boxCheck)) {
                        return false;
                    }
                }
            }
        }

        // If no duplicate is found, the board is valid
        return true;
    }

    public static void main(String[] args) {
        SudokuValidator validator = new SudokuValidator();

        char[][] board1 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] board2 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Is board1 valid? " + validator.isValidSudoku(board1)); // Output: true
        System.out.println("Is board2 valid? " + validator.isValidSudoku(board2)); // Output: false
    }
}
