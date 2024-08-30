package my_algos.algo2_strings.my_algo_solution7;



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

        //1 return default
        if(strs.length == 0 || strs == null) return "";

        //2 resulting str
        if(strs.length == 1) return strs[0];


        //3 Hold the first item as the first prefix
        String prefix = strs[0];

        //4 For loop through the strings
        for (int i = 0; i < strs.length; i++) {

            //4.1 while loop while indexOf prefix at string at index i
            while(strs[i].indexOf(prefix) != 0){

                //4.1.1 get the substring excluding the last character
                prefix = prefix.substring(0,prefix.length()-1);

                //4.1.2 if prefix is empty return ""
                if(prefix.isEmpty()){
                    return "";
                }

            }

        }
        //5 return prefix
     return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        // Example 1
        String[] strs1 = {"flkower", "flkow", "flkight"};
        System.out.println("The longest common prefix is: " + solution.longestCommonPrefix(strs1)); // Output: "fl"

        // Example 2
        String[] strs2 = {"ldog", "lracecar", "lcar"};
        System.out.println("The longest common prefix is: " + solution.longestCommonPrefix(strs2)); // Output: ""

        String samuel = "samuel";

        System.out.println(samuel.indexOf("samu"));
    }
}
