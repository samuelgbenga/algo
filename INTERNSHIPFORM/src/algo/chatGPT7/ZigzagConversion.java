package algo.chatGPT7;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
/*
        This algo has three major steps
        - instantiate string builder and other things (1....5)
        - do the zig zag (6.1, 6.2, 6.3)
        - return the final result ( 7...9)

 */


        // step 1 instantiate the string builder array/ list
        // 1 return s in the numRow is 1 num of row is greater that s.length
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        //2 instatiate string builder array with number of rows = numRows
        StringBuilder[] rows = new StringBuilder[numRows];

        // 3 make each item in the array an instance of stringbuilder using for loop
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // 4 instantiate current row to 0
        int currentRow = 0;

        // 5 instantiate goingDown boolean to false
        boolean goingDown = false;

        // step 2 do the zig sag

        // 6 loop through the string using enhance for loop to append character to each string buildler
        for (char c : s.toCharArray()) {

            //6.1 append the character rows element at currentRow(index)
            rows[currentRow].append(c);

            //6.2 negate false if currentRow = 0 or current row is the length of rows (numRows - 1)
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            //6.3 increase current row if going dow is true else decrease
            currentRow += goingDown ? 1 : -1;
        }

      //- step 3 get the final result after the zig zag

        //7 instantiate end result to stringbuilder
        StringBuilder result = new StringBuilder();

        //8 append each item in rows to the result
        for (StringBuilder row : rows) {
            result.append(row);
        }

        //9 return result as string
        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion converter = new ZigzagConversion();
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println(converter.convert(s1, numRows1)); // Output: "PAHNAPLSIIGYIR"

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println(converter.convert(s2, numRows2)); // Output: "PINALSIGYAHRPI"

        String s3 = "A";
        int numRows3 = 1;
        System.out.println(converter.convert(s3, numRows3)); // Output: "A"
    }
}
