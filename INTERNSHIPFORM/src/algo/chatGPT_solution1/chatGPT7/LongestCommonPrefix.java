package algo.chatGPT_solution1.chatGPT7;


/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assume the first string is the common prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Truncate the last character of the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // If no common prefix, return empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        // Example 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("The longest common prefix is: " + solution.longestCommonPrefix(strs1)); // Output: "fl"

        // Example 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("The longest common prefix is: " + solution.longestCommonPrefix(strs2)); // Output: ""
    }
}
