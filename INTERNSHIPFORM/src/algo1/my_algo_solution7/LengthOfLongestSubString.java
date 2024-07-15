package algo1.my_algo_solution7;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {

    public static int solution(String str){

        //1 return 0 if str is null
        if(str == null || str.length() == 0) return 0;

        //2 intiata max length = 0
        int maxLength = 0;

        //3 initiate right = 0
        int right = 0;

        //4 initate left = 0
        int left = 0;

        //5 initiate set Hashset
        Set<Character> set = new HashSet<>();

        //6 loop through using while the right is less that the length of the str
        while(right < str.length()){
            // 1 get the current character at right
            char currentChar = str.charAt(right);
            // 2 if it is not contained already
            if(!set.contains(currentChar)){
                //1- add that character to the hashset
                set.add(currentChar);

                //2- compare and return maxlength/update the maxlength
                maxLength = Math.max(maxLength, right - left + 1);

                //3- increase the right
                right++;

            }

            // 3 if it is contained already
            else{
                //1- remove the character from the hashset
                set.remove(str.charAt(left));



                //2- increase the left side
                left++;

            }
        }

        //7 return maxLenght

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));


    }
}
