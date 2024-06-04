package week_7.practice1.algo10;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplication {
    public static void main(String[] args) {
        // test your cases here
        System.out.println(longestSubstringWithoutDuplication("decadevsindecagonarelit"));
    }

    public static String longestSubstringWithoutDuplication(String str) {
        // Do your magic here

        // This map keeps track of the last seen index of each character in the string
        Map<Character, Integer> lastSeen = new HashMap<>();

        // This array will store the start and end indices of the longest substring without duplicates found so far
        int[] longest = {0, 1};
        // This variable tracks the starting index of the current substring without duplicates
        int startIdx = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char c = str.charAt(i);
            // Check if the character has been seen before
            if (lastSeen.containsKey(c)) {
                // Update the start index to the maximum of the current start index
                // or the index after the last occurrence of the current character
                //if it happens that we have seen it before, but it is way over at the back
                // lets just continue with the substring we are working on. If that is not the case
                // if the occourence is as within our substring then you will need to change
                // the start index to begin from the index just immediately after the reocurrence of such
                // alphabet.
                startIdx = Math.max(startIdx, lastSeen.get(c) + 1);
            }

            // Update the longest substring if the current one is longer
            // that is exactly what it does, it updates the substring if
            // the current i count substring length is greater than our
            // actual designated substring length starting both from the startIndex

            if (longest[1] - longest[0] < i + 1 - startIdx) {
                longest = new int[] {startIdx, i + 1};
            }

            // Update the last seen index of the current character to the current index
            lastSeen.put(c, i);
        }

        // Extract the longest substring without duplicates using the indices stored in the longest array
        String result = str.substring(longest[0], longest[1]);

        // Return the result
        return result;
    }
}
