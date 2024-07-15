package algo.chatGPT5;

import java.util.*;

public class LongestSubStringLength{

    public int lengthOfLongestSubstring(String s) {


        // 1. check if s is null or length is 0 return 0
        if (s == null || s.length() == 0) {
            return 0;
        }

        //2. create a  set of character hashset
        Set<Character> set = new HashSet<>();
        //3 instantiate maxlength
        int maxLength = 0;

        //4 instantiate left point
        int left = 0;

        //5 instantiate right point
        int right = 0;

        //6 create a while loop to loop aslong as right point is less that the length
        while (right < s.length()) {

            //6.1 instantiate currentChar char to hold char at right
            char currentChar = s.charAt(right);

            //6.2 check if the currentChar is not in set
            if (!set.contains(currentChar)) {

                //6.2.1 add the currentChar
                set.add(currentChar);

                //6.2.2 return the maximum between maxlength and the difference between right - left + 1
                maxLength = Math.max(maxLength, right - left + 1);

                //6.2.3 increase right
                right++;

            }
            // 6.3 if set contains
            else {
                // 6.3.1 remove the character at left
                set.remove(s.charAt(left));
                // 6.3.2 increase left
                left++;
            }
        }

        //7 return maxLength
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubStringLength solution = new LongestSubStringLength();

        // Test cases
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(solution.lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println(solution.lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println(solution.lengthOfLongestSubstring(s3)); // Output: 3
    }
}
