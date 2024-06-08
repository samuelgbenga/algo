package week_7.practice1.algo_section2.algo16.NumberOccurence;


import java.util.HashSet;

//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.
//
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//
//Example 2:
//Input: nums = [1,2,3,4]
//Output: false
//
//Example 3:
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
public class Main {

    public static void main(String[] args) {

        int[] arr = {2,10,4,5,6};

        System.out.println(uniqueSubstring(arr));
    }

    private static boolean uniqueSubstring(int[] arr){
        HashSet<Integer> newArr = new HashSet<>();

        for(int a : arr){
            if(!newArr.add(a)){
                return true;
            }
        }
        return false;
       // return IntStream.of(arr).anyMatch((a)-> !newArr.add(a));
    }
}
