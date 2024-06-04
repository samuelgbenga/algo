package week_7.practice1.algo7;

//Candidate Instructions
//        Write a function that takes in a string and returns its longest substring
//        without duplicate characters.
//
//        You can assume that there will only be one longest substring without duplication.
//
//        Sample Input
//        string = "clementisacap"
//
//        Sample Output
//        "mentisac"
//        As you can see from the input above, the longest string we can take from the word
//        that does not contain any duplicate characters is mentisac
//
//

//Test cases


import java.util.HashMap;

public class LongestSubstringWithoutDuplication {
    public static void main(String[] args) {
        // test your cases here
        System.out.println(longestSubstringWithoutDuplication("decadevsindecagonarelit"));
    }

    public static String longestSubstringWithoutDuplication(String str) {
        // Do your magic here

        HashMap<Character, Integer> mappy = new HashMap<>();
        int[] subLength = {0,1};
        int startingPoint = 0;
        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);

            if(mappy.containsKey(c)) startingPoint = Math.max(startingPoint, mappy.get(c)+1);

            if(subLength[1]- subLength[0] < i+1 - startingPoint) subLength = new int[]{startingPoint, i+1};

            mappy.put(c, i);

        }

        return str.substring(subLength[0], subLength[1]);
    }
}