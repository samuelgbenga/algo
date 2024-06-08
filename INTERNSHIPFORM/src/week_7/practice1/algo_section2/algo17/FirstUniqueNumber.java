package week_7.practice1.algo_section2.algo17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueNumber {

    public static String firstNonRepeatingLetter1(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        // Use a HashMap to store character counts
        Map<Character, Integer> countMap = new HashMap<>();

        // Populate the map with character counts
        for (char c : str.toCharArray()) {
            char lowerCaseChar = Character.toLowerCase(c);
            countMap.put(lowerCaseChar, countMap.getOrDefault(lowerCaseChar, 0) + 1);
        }

        // Find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (countMap.get(Character.toLowerCase(c)) == 1) {
                return Character.toString(c);
            }
        }

        return "";
    }



        public static String firstNonRepeatingLetter(String str) {
            if (str == null || str.isEmpty()) {
                return "";
            }
            // Use a LinkedHashMap to maintain insertion order
            Map<Character, Integer> countMap = new LinkedHashMap<>();

            // Populate the map with character counts
            for (char c : str.toCharArray()) {
                char lowerCaseChar = Character.toLowerCase(c);
                countMap.put(lowerCaseChar, countMap.getOrDefault(lowerCaseChar, 0) + 1);
            }

            // Find the first non-repeating character
            for (char c : str.toCharArray()) {
                if (countMap.get(Character.toLowerCase(c)) == 1) {
                    return Character.toString(c);
                }
            }

            return "";

}
        private static String myOwnSolution(String s){

        HashMap<Character, Integer> mappy = new HashMap<>();

        for(char a: s.toCharArray()){
            char b = Character.toLowerCase(a);
            mappy.put(b, mappy.getOrDefault(b,0)+1);
        }

        for(char a: s.toCharArray()){

            if(mappy.get(Character.toLowerCase(a)) == 1){
                return ""+a;
            }
        }

        // this is the first thing to do after max has been returned we do nothing a
            // and then we do something

        return "";
        }

    public static void main(String[] args) {

        String str = "ssSaMMauueell";

        System.out.println(myOwnSolution(str));



       // System.out.println("hello world");
    }
}

