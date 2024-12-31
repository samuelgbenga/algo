package my_algos1.solution2;

public class MinWindowSubStringWithT {

    /**
     * Intuition
     * The goal is to find the minimum window in string s that contains all characters from string t. The intuition is to use a sliding window approach with two pointers.
     *
     * Approach
     * Initialize a character array map of size 128 to store the frequency of characters in string t.
     * Initialize variables count, start, end, minLen, and startIndex.
     * Iterate through each character in string t and update the character frequency in the map.
     * Use two pointers (start and end) to slide the window and find the minimum window that contains all characters from string t.
     * Increment end and decrease the frequency in map for each character encountered until all characters from t are present in the window.
     * When all characters from t are present, update minLen and startIndex based on the current window size and starting index.
     * Increment start and increase the frequency in map until the window no longer contains all characters from t.
     * After the iteration, the minimum window is found, and the result is a substring of s starting from startIndex with length minLen.
     * Complexity
     * Time complexity: O(n), where n is the length of string s.
     * Space complexity: O(1), as the map array has a constant size (128).
     * image.png
     *
     * UPVOTE iF iT WAS HELPFUL :)
     * Code
     * class Solution {
     *     public String minWindow(String s, String t) {
     *         if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
     *                 s.length() < t.length()) {
     *             return new String();
     *         }
     *         int[] map = new int[128];
     *         int count = t.length();
     *         int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
     *         /// UPVOTE !
     *         for (char c : t.toCharArray()) {
     *             map[c]++;
     *         }
     *
     *         char[] chS = s.toCharArray();
     *
     *         while (end < chS.length) {
     *             if (map[chS[end++]]-- > 0) {
     *                 count--;
     *             }
     *             while (count == 0) {
     *                 if (end - start < minLen) {
     *                     startIndex = start;
     *                     minLen = end - start;
     *                 }
     *                 if (map[chS[start++]]++ == 0) {
     *                     count++;
     *                 }
     *             }
     *         }
     *
     *         return minLen == Integer.MAX_VALUE ? new String() :
     *                 new String(chS, startIndex, minLen);
     *     }
     * }
     */
}
