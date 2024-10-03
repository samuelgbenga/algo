package algo.chatGPT_solution1.chatGPT9;

import java.util.*;

public class SortColors {
    public static void sortColors(int[] nums) {

        // 1 init low
        int low = 0;
        // 2 middle high
        int mid = 0;
        // 3 init high
        int high = nums.length - 1;

        //4 loop throught the array using while from middle to high
        while (mid <= high) {

            //4.1 if the num at the middle is zero swap  num at low to num at middle then increase both low and mid
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            // 4.2 else if num at mid is 1 just increase mid
            else if (nums[mid] == 1) {
                mid++;
            }
            // 4.3 else if num at mid 2 is swap it with the num at high then only decrease high
            else {  // nums[mid] == 2
                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        // Output: [0, 0, 1, 1, 2, 2]
        System.out.println(Arrays.toString(nums1));

        // Example 2
        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        // Output: [0, 1, 2]
        System.out.println(Arrays.toString(nums2));
    }
}
