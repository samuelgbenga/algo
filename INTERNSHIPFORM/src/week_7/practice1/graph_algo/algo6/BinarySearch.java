package week_7.practice1.graph_algo.algo6;

public class BinarySearch {
    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // first loop through as long as left is greater than right
        // left is the start/
        // right is the end length
        while (left <= right) {
            // implement divide and conquer
            int mid = left + (right - left) / 2;

            // if found in the middle return middle
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) { // if greater than middle replace left to middle + 1
                left = mid + 1;
            } else {            // if less than middle replace right with middle minus 1
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        System.out.println(search(nums1, target1)); // Output: 4

        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println(search(nums2, target2)); // Output: -1
    }
}
