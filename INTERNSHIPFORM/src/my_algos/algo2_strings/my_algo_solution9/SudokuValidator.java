package my_algos.algo2_strings.my_algo_solution9;

import java.util.HashMap;
import java.util.HashSet;

public class SudokuValidator {


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



    private boolean isValidSudoku(char[][] board) {

        // 1 init  hashset for string
        HashSet<String> sudoku = new HashSet<>();
        // 2 loop through from row to row
        for (int i = 0; i < 9; i++) {
            // 2.1 loop through from col to col
            for (int j = 0; j < 9; j++) {
                // 2.1.1 init current index at i and j
                int current = board[i][j];
                // 2.1.2 if current is not .
                if(current != '.'){
                    // 2.1.2.1 init row with i and current
                    String row = "row"+ i + current;
                    // 2.1.2.2 init col with j and current
                    String col = "col"+ j + current;
                    // 2.1.2.3 init box with i/3 and j/3 and current
                    String box = "box" + i/3 + j/3 + current;
                    // 2.1.2.4 if not add any of this three int return false
                    if(!sudoku.add(row) || !sudoku.add(col) || !sudoku.add(box)) return false;
                }
            }
        }

        // 3 return true

        return true;
    }
}

