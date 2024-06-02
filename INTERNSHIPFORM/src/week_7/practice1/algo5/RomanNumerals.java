package week_7.practice1.algo5;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    class Solution1 {
        public int romanToInt(String s) {

            int result = 0;
            // using hashmap let see
            Map<Character, Integer> romanMap = new HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);

            int length = s.length();

            for (int i = 0; i < length; i++){
                int currentVal = romanMap.get(s.charAt(i));
                result += (i < length - 1 && currentVal < romanMap.get(s.charAt(i + 1)))? currentVal : -currentVal;
            }

//            s = s.toUpperCase();
//            int result = 0;
//            String[] strArr = s.split("");
//            if(strArr.length == 1) return startNumber(strArr[0]);
//
//
//            // loop through
//            int i = 1;
//            for(String a: strArr) {
//                int firstNum = startNumber(strArr[i]);
////                if (firstNum <= startNumber(a)) {
////                    result += startNumber(a);
////                } else {
////                    result = result - startNumber(a);
////                }
//                result += (firstNum <= startNumber(a))? startNumber(a) : -startNumber(a);
//
//
//                // seperation
////                if (i < strArr.length - 1 && startNumber(a) < firstNum) {
////                    // Subtract the current value because it's part of a subtractive combination
////                    result -= startNumber(a);
////                } else {
////                    // Add the current value
////                    result += startNumber(a);
////                }
//
//                if (i < strArr.length - 1)
//                    i++;
//
//            }
//
//            return result;
            return result;
        }

        private int startNumber(String a){
            switch(a){
                case "I":return 1;
                case "V":return 5;
                case "X":return 10;
                case "L":return 50;
                case "C":return 100;
                case "D":return 500;
                case "M":return 1000;
                default: return -1;
            }
        }
}

// final solution that solve the problems and gets the highest;

    class Solution {
        public int romanToInt(String s) {

            int result = 0;
            Map<Character, Integer> romanMap = new HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);

            int length = s.length();

            for (int i = 0; i < length; i++){
                int currentVal = romanMap.get(s.charAt(i));
                result += (i < length - 1 && currentVal < romanMap.get(s.charAt(i + 1)))? -currentVal : currentVal;
            }

            return result;

        }
    }
}
