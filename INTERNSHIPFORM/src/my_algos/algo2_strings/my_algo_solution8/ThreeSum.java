package my_algos.algo2_strings.my_algo_solution8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        // four major steps
        // step 1 init the result
        List<List<Integer>> result = new ArrayList<>();
        // the next two steps contains the core logic
        // step 2 sort the nums array
        Arrays.sort(nums);
        // step 3 loop through and perform some more logic using for loop
        for (int i = 0; i < nums.length-2; i++) {
        // this step gives birth to 5 more steps
            // step 3.1 skip repeteation
            if(i > 0 && nums[i] == nums[i-1]) continue;
            // step 3.2 init right
            int right = nums.length - 1;
            // step 3.3 init left
            int left = i + 1;
            // step 3.4 init target
            int target = -nums[i];
            // step 3.5 loop through while left is less than right
            while(left < right) {
                // this step also gave birth to five more steps
                // step 3.5.1 instantiate sum
                int sum = nums[left]+ nums[right];
                // step 3.5.2 a pregnant if sum == target
                if (sum == target) {
                    // this pregnant if contains 5 simple steps
                    // 3.5.2.1 add to result current index left and right
                    result.add(Arrays.asList( nums[i], nums[left], nums[right]));
                    // 3.5.2.2 while looping check that current is equal to next increase left
                    while (left<right && nums[left] == nums[left+1]) left++;
                    // 3.5.2.3 while looping check that current is equal to prev increase right
                    while (left<right && nums[right] == nums[right-1]) right--;
                    // 3.5.2.4 increase left any ways
                    left++;
                    // 3.5.2.5 increase right any ways
                    right--;
                }
                // step 3.5.3 if else sum < target increase left
                else if(sum < target) left++;
                // step 3.5.4 sum > target reduce right
                else right--;
            }

        }
        // step 4 return the result

        return result;
    }





    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();

        // Example 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Triplets that sum to zero: " + solution.threeSum(nums1));
        // Output: [[-1, -1, 2], [-1, 0, 1]]

        // Example 2
        int[] nums2 = {0, 1, 1};
        System.out.println("Triplets that sum to zero: " + solution.threeSum(nums2));
        // Output: []

        // Example 3
        int[] nums3 = {0, 0, 0};
        System.out.println("Triplets that sum to zero: " + solution.threeSum(nums3));
        // Output: [[0, 0, 0]]
    }
}
