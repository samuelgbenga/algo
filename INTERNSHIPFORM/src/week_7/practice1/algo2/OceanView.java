package week_7.practice1.algo2;

//Description
//        Given an array of integers heights of length n, indicating that there are n buildings,
//        heights[i] represents the height of the building at the corresponding position.
//
//        To the right of a building is the ocean, and for each building,
//        if all buildings to the right of that building are strictly lower than it,
//        then that building has a view of the ocean.
//
//        Returns a list of indexed subscripts of all buildings with an ocean view,
//        in ascending order, with index subscripts starting at 0.
//
//        Example
//        Example 1:
//
//        Input:
//        heights = [5, 2, 3, 4] [f, s, t, f]
//        Output:
//        [0, 3]
//        Explanation:
//        Building No.1 is 2 in height and Building No.2 is 3 in height and is not
//        strictly higher than the building to its right
//        Example 2:
//
//        Input:
//        heights = [2, 2, 2, 2, 2]
//        Output:
//        [4]
//        Explanation:
//        There are no buildings strictly higher than the right side, so only the
//        rightmost building, No. 4, has a view of the sea

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class OceanView {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findBuildings(new int[]{2,2,2,2,2})));

    }

    public static int[] findBuildings(int[] heights) {
        // write your code here


        ArrayList<Integer> arrList = new ArrayList<>();

        int minHeight = heights[heights.length-1];
        arrList.add(heights.length-1);


        // add the index of numbers that are greater than the first number to the index then change
        // the index to the next greater element
        for(int i = heights.length-2; i>=0; i--){
            if(heights[i]>minHeight){
                arrList.add(i);
                minHeight = heights[i];
            }
        }

        // convert back to an array after reversing the arrayList
        int[] arr = new int[arrList.size()];
        int count = 0;
        for(int a: arrList.reversed()){
            arr[count++] = a;
        }





        return arr;
    }
}
