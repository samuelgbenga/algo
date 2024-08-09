package my_algos.algo1.my_algo_solution9;

import java.util.ArrayList;

public class ZigzagConversion {


    private String convert(String s, int numRow){

        /*
        3 major steps
        - intialize String builder and others (1 - 5)
        - Do the zig zag (6.1 - 6.3)
        - Build the resuilt and send as string (7 - 9)
         */

        // 1 return default
        if(numRow == 1 || numRow >= s.length()) return s;

        // 2 - 3 initialize String builder array
        StringBuilder[] rows = new StringBuilder[numRow];

        // 3 intialize each element to string builder
        for(int i = 0; i < numRow; i++) rows[i] = new StringBuilder();



        //4 initialize boolean go down
        boolean goDown = false;

        //5 initialze the currentChar counter in
        int currentChar = 0;

        //6 do the zig zag
        for(char c: s.toCharArray()){
            // 1 append the current character to rows at currentChar
            rows[currentChar].append(c);

            //2 and 3 do the zig sag stuff
            //2
            if(currentChar == 0 || currentChar == numRow - 1) goDown = !goDown;

            //3 do the zig zag continued
            currentChar += (goDown) ? 1 : -1;

        }

        // 7 - 9 include returning the result so lets return
        //7  create the result stringBuilder
        StringBuilder result = new StringBuilder();

        //8 use for loop to append the individuel result from rows
        for(StringBuilder c: rows) result.append(c);

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
