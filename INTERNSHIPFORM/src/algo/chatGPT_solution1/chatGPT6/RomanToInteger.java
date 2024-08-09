package algo.chatGPT_solution1.chatGPT6;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        // Map to store the Roman numerals and their corresponding integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int value = romanMap.get(s.charAt(i));

            // If the current symbol is smaller than the next symbol, subtract it
            if (i < n - 1 && value < romanMap.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                // Otherwise, add it to the result
                result += value;
            }
        }

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
