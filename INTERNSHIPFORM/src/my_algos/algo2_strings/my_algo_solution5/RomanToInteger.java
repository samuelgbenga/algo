package my_algos.algo2_strings.my_algo_solution5;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        // 1 init the map
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);


        // 2 init the length of string
        int n = s.length();

        // 3 init the result
        int result = 0;

        // 4 for loop with i and len
        for (int i = 0; i < n; i++) {


            // 4.1 get the current number value at ith on the map
            int value = romanMap.get(s.charAt(i));

            // 4.2 decrease result by value if i is less than lentht and value is less than value at i+1
            if(i < n - 1 && value < romanMap.get(s.charAt(i + 1))){
                result -= value;
            }

            // 4.3 else increase result by value
            else {
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
