package algo.chatGPT_solution1.chatGPT8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 */

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        // step 1 init a muli list result
        List<List<Integer>> result = new ArrayList<>();
        // Step 2: Sort the given array
        Arrays.sort(nums);
        // Step 3: Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // step 3.1: Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // Step 3.2: init left
            int left = i + 1;
            // step 3.3: init right
            int right = nums.length - 1;
            // step 3.4 init value at index negative
            int target = -nums[i];
            // step 3.5: loop while left is less than right
            while (left < right) {
                // step 3.5.1 sum value at right and left
                int sum = nums[left] + nums[right];
                // step 3.5.2 : check if sum is equal target
                if (sum == target) {
                    // step 3.5.2.1 add to result  num at i, left, and right
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // step 3.5.2.2 Skip duplicates for the left pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // step 3.5.2.3 Skip duplicates for the right pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    //step 3.5.2.4  Move left pointer up
                    left++;

                    // step 3.5.2.5 move right pointer down
                    right--;
                }
                // step 3.5.3 if sum is less than just move left pointer up
                else if (sum < target) {
                    left++; // We need a larger sum, move the left pointer to the right
                }
                // step 3.5.4 if sum is greater than target move right pointer
                else {
                    right--; // We need a smaller sum, move the right pointer to the left
                }
            }
        }
        // step 4 return result
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
