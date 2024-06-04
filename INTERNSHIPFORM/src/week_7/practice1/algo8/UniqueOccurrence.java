package week_7.practice1.algo8;

import java.util.HashMap;
import java.util.HashSet;


//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//
//
//
//        Example 1:
//
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//        Example 2:
//
//Input: arr = [1,2]
//Output: false
//Example 3:
//
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true
//
//
//Constraints:
//
//        1 <= arr.length <= 1000
//        -1000 <= arr[i] <= 1000





public class UniqueOccurrence {

    public static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> mappy = new HashMap<>();


        //mappy.
        for(int a: arr){
           if(!mappy.containsKey(a)){
               mappy.put(a,1);
           }else {
               int i = mappy.get(a)+ 1;
               mappy.put(a, i);
           }
        }
        HashSet<Integer> check = new HashSet<>();
        mappy.forEach((a,b)-> {
            check.add(b);
        });



        //System.out.println(mappy);

        return check.size() == mappy.size();

    }

    public static void main(String[] args) {


        int[] arr = new int[]{1, 2, 2, 1, 1, 3, 3};

        System.out.println(uniqueOccurrences(arr));
    }
}
