package week_7.practice1.graph_algo.algo7;

public class BinarySearch {
    private static int search(int[] nums, int target) {
       // get the middle index
        int middleIndex;
        int start = 0;
        int end = nums.length - 1;

        while(end>=start){
            middleIndex = start + (end - start)/2;
            if(target == nums[middleIndex]){
                return middleIndex;
            }else  if(target < nums[middleIndex]){
                // move the left
                // keep the start
                end = middleIndex - 1;
            }else if( target > nums[middleIndex]){

                start = middleIndex + 1;
            }
        }

        //
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