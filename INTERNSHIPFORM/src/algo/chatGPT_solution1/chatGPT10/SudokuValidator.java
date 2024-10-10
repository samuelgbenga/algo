package algo.chatGPT_solution1.chatGPT10;

import java.util.HashSet;

public class SudokuValidator {

    public boolean isValidSudoku(char[][] board) {
        // Initialize hash sets to keep track of digits in rows, columns, and boxes.
        // 1 init HashSet as String
        HashSet<String> seen = new HashSet<>();

        // Traverse each cell in the Sudoku board
        // 2 init for loop to loop through the sudoku lenght
        for (int i = 0; i < 9; i++) {
            //2.1 and another to loop through the breath
            for (int j = 0; j < 9; j++) {
                //2.1.1 get the current value
                char current = board[i][j];

                //2.1.2 if not equal . (dot) since we are only considering numbers
                // Only check if the current cell is not empty
                if (current != '.') {
                    // Prepare strings that represent the current number's row, column, and box
                    //2.1.2.1 init a row string with index i (for row) and the current value
                    String rowCheck = "row" + i + current;
                    //2.1.2.2 init a col string with index j (for col) and the current value
                    String colCheck = "col" + j + current;
                    //2.1.2.3 init string box with i/3, j/3 and current
                    String boxCheck = "box" + (i / 3) + (j / 3) + current;

                    //2.1.2.4 If any of these checks have already been seen, it means there's a duplicate return false
                    if (!seen.add(rowCheck) || !seen.add(colCheck) || !seen.add(boxCheck)) {
                        return false;
                    }
                }
            }
        }

        //3 If no duplicate is found, the board is valid return true
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
