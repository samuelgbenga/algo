package week_7.practice1.algo16.longestsubstring;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

//    2.
//    Given a string s, find the length of the longest
//    substring without repeating characters.
//    Example 1:
//    Input: s = "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.
//
//    Example 2:
//    Input: s = "bbbbb"
//    Output: 1
//    Explanation: The answer is "b", with the length of 1.
//
//    Example 3:
//    Input: s = "pwwkew"
//    Output: 3
//    Explanation: The answer is "wke", with the length of 3.
//    Notice that the answer must be a substring, "pwke" is a subsequence      and not a substring.

    public static void main(String[] args) {

        String str = "ajsdfalsdjfladsjf";
        System.out.println(longestSubStr(str));


    }

    private static String longestSubStr(String str){

        //init the hashmap : character and counting integer
        HashMap<Character,Integer> lastSeen = new HashMap<>();
        //init the arr subString
        int[] subStr = {0,1};
        int start = 0;
        //check if it contains: and update the start string to the current

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(lastSeen.containsKey(c)){
                start = Math.max(lastSeen.get(c)+1, start);
            }

            if(subStr[1]-subStr[0] < i+1 - start){
                subStr = new int[]{start, i+1};
            }

            lastSeen.put(c, i);

        }

        // update substring if current sub string is muchier

        return str.substring(subStr[0],subStr[1]);
    }
}
