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
     *
     *         // locate by character increase the presence of that character by one.
     *         for (char c : t.toCharArray()) {
     *             map[c]++;
     *         }
     *
     *          // converts the actual s to array of characters
     *         char[] chS = s.toCharArray();
     *
     *          // loop while end is less than length of the char array
     *         while (end < chS.length) {
     *              // map[chS[end++]] use current end value then increase = end++
     *              //                  get the char at that end value in chS array = chS[end] = e.g 'a'
     *              //                  locate the character in 'a' in map and decrease by one = map['a']
     *              //                  so the value there would be an integer -1;
     *              // finally if that current value before decrease is greater than 0 reduce count.
     *             if (map[chS[end++]]-- > 0) {
     *                 count--;
     *             }
     *
     *             // loop while count is equal zero
     *             while (count == 0) {
     *             // this is to adjust to the current minimum
     *                 if (end - start < minLen) {
     *                     startIndex = start;
     *                     minLen = end - start;
     *                 }
     *                 // same thing goes for this only this time it is an increament and the condition
     *                 // is to increase count if the current number of occurence of that character is equal 0
     *                 // and it uses start index
     *                 if (map[chS[start++]]++ == 0) {
     *                     count++;
     *                 }
     *             }
     *
     *
     *         }
     *
     *         return minLen == Integer.MAX_VALUE ? new String() :
     *                 new String(chS, startIndex, minLen);
     *     }
     * }
     */

    private static String minWindow(String s, String t){

        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
                     s.length() < t.length()) {
                 return new String();
             }

        // initialization
        int[] map = new int[128];
              int count = t.length();
              int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;

              // populate map with t but numbers though
              for (char c : t.toCharArray()) {
                 map[c]++;
             }

              char[] chArr = s.toCharArray();

              while(end < chArr.length){

                  // if the character is present reduce count
                  // note: the length of count is the number of char in t
                  if(map[chArr[end++]]-- > 0){
                      count--;
                  }
                  // if we count finish
                  while (count == 0){
                      // do the switching
                      if(end - start < minLen){
                          minLen = end - start;
                          startIndex = start;
                      }
                      // if that character is present and emptied
                      if(map[chArr[start++]]++ == 0){
                          count++;
                      }
                  }

              }

              return minLen == Integer.MAX_VALUE ? new String() :
                  new String(chArr, startIndex, minLen);
    }

    public static void main(String[] args) {

        String s = "samuel";
        String t = "szx";
        System.out.println(minWindow(s,t));;

    }
}
