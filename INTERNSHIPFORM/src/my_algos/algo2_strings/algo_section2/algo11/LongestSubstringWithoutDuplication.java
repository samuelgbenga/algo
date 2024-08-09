package my_algos.algo2_strings.algo_section2.algo11;

import java.util.HashMap;

public class LongestSubstringWithoutDuplication {
    public static void main(String[] args) {
        // test your cases here
        System.out.println(longestSubstringWithoutDuplication("decadevsindecagonarelit"));
    }

    public static String longestSubstringWithoutDuplication(String str) {
        // Do your magic here

        HashMap<Character, Integer> mappy = new HashMap<>();

        int[] subStrLen = {0,1};
        int start = 0;
        for (int i =0; i<str.length(); i++){

            if(mappy.containsKey(str.charAt(i))){
              start = Math.max(start, mappy.get(str.charAt(i))+1) ;
            }
            if(subStrLen[1]- subStrLen[0] < i+1 - start){
                subStrLen = new int[]{start, i+1};
            }

            mappy.put(str.charAt(i), i);

        }

       return str.substring(subStrLen[0], subStrLen[1]);
    }
}
