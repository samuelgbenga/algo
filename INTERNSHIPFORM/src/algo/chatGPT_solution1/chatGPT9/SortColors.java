package algo.chatGPT_solution1.chatGPT9;

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        // Traverse the array
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {  // nums[mid] == 2
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
        System.out.println(java.util.Arrays.toString(nums1));

        // Example 2
        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        // Output: [0, 1, 2]
        System.out.println(java.util.Arrays.toString(nums2));
    }
}
