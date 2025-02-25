package new_algo.medianoftwoarrays;

public class MedianOfTwoArrays {
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;
        int low = 0, high = x;

        while (low <= high) { // loop while low is less that high
            int partitionX = (low + high) / 2; // get the middle of the first array
            int partitionY = (x + y + 1) / 2 - partitionX; // get the middle of the second array also

            // get element to the left and right of x
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            // get element to the left and right of y (the second array)
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            // compare the elements at the opposite isle of the arrays
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // if the length of both arr is an even return the average of both element
                // comparing the same sides of the both arrays
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    // if it is not the case then we have a middle which would always be the left return
                    // return the max of both
                    return Math.max(maxLeftX, maxLeftY);
                }
            }
            // if the case is left of the first array is greater than the right
            // reduce assign high (previously x) to the middle of x - 1 which is the partitionX - 1
            else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                // if the case is that maxLeftY is greater the minRight of X
                // increase the low by the x partition and 1
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findMedianSortedArrays(new int[]{1, 3}, new int[]{2})); // Output: 2.0
        System.out.println(sol.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})); // Output: 2.5
    }
}
