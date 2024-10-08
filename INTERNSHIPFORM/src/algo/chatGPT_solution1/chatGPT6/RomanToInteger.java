package algo.chatGPT_solution1.chatGPT6;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        // Map to store the Roman numerals and their corresponding integer values
        // 1 map the number to the roman equivalalent standard
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // 2 init result to zero
        int result = 0;

        // 3 init n to length of the roman numeral given
        int n = s.length();

        // 4 loop through n
        for (int i = 0; i < n; i++) {

            // 4.1 get value at index i on the map
            int value = romanMap.get(s.charAt(i));

            // If the current symbol is smaller than the next symbol, subtract it
            // 4.2 if i is less than length and the value is less than char at i + 1 subtract value from result
            if (i < n - 1 && value < romanMap.get(s.charAt(i + 1))) {
                result -= value;
            }
            // 4.3 else add value to result
            else {
                // Otherwise, add it to the result
                result += value;
            }
        }

        //5 return result
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();

        // Example 1
        String s1 = "III";
        System.out.println("The integer value of " + s1 + " is: " + solution.romanToInt(s1)); // Output: 3

        // Example 2
        String s2 = "LVIII";
        System.out.println("The integer value of " + s2 + " is: " + solution.romanToInt(s2)); // Output: 58

        // Example 3
        String s3 = "MCMXCIV";
        System.out.println("The integer value of " + s3 + " is: " + solution.romanToInt(s3)); // Output: 1994
    }
}
