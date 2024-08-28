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

        // 1 return default
        if (strs == null || strs.length == 0) {
            return "";
        }

        //2 Assume the first string is the common prefix
        String prefix = strs[0];

        //3 loop through the string starting from i = 1 Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // 3.1 loop while index at prefix is not at 0 index
            while (strs[i].indexOf(prefix) != 0) {
                // 3.1.1 Truncate the last character of the prefix using substring
                prefix = prefix.substring(0, prefix.length() - 1);
                // 3.1.2 If no common prefix, return empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        // 4 return the prefix
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

        String samuel = "samuel";

        System.out.println(samuel.indexOf("samu"));
    }
}
