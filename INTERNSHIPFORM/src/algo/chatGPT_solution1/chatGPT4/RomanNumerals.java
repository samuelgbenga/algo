package algo.chatGPT_solution1.chatGPT4;

public class RomanNumerals {


    public static String intToRoman(int num) {


        // 1- declare all the standard value (odd values like 1, 4, 5, 9,10 ,40,50 ,90,100 ,400, 5000, 900,
        // Define arrays of Roman numeral symbols and their corresponding values
         final int[] VALUES = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

         // 2 - declare there respective symbol as an array of strings.
         final String[] SYMBOLS = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };

         // 3: initialize a string builder
        StringBuilder roman = new StringBuilder();

        // 4: loop through the value array
        // Iterate through the values array and construct the Roman numeral string
        for (int i = 0; i < VALUES.length; i++) {

            // 4.1: loop while the number is greater than value at i
            while (num >= VALUES[i]) {
                //4.1.1 append the symbol to the string builder declared before
                roman.append(SYMBOLS[i]);

                //4.1.2 reduce the num by value at i.
                num -= VALUES[i];
            }
        }

        //5.0 return the numeral
        return roman.toString();
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(intToRoman(3749)); // Output: "MMMDCCXLIX"
        System.out.println(intToRoman(58));   // Output: "LVIII"
        System.out.println(intToRoman(1994)); // Output: "MCMXCIV"
    }
}
