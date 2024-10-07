package my_algos.algo3_graph.algo10;

import java.util.Arrays;

public class SortColors {

    private static void sortColors(int[] nums){

        // 1 init high
        int high = nums.length - 1;
        // 2 init low
        int low = 0;
        // 3 init middle
        int middle = 0;
        // 4 loop through from middle
        while(middle <= high){
            // 4.1 if value at middle == 0 swap with value at low then increase both
            if(nums[middle] == 0){
                int temp = nums[low];
                nums[low] = nums[middle];
                nums[middle] = temp;
                middle++;
                low++;
            }
            // 4.2 if value at middle == 1 just increase middle
            else if(nums[middle] == 1){
                middle++;
            }
            // 4.3 else swap value at middle with value at high then decrease high
            else {
                int temp = nums[high];
                nums[high] = nums[middle];
                nums[middle] = temp;
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
