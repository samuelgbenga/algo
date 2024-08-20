package algo.chatGPT_solution1.chatGPT5;

/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        // 1 init left from 0
        int left = 0;

        // 2 init right from length - 1
        int right = height.length - 1;

        // 3 init area
        int maxArea = 0;

        // 4 while left is less than right
        while (left < right) {

            // 4.1 get the width by subracting the right and left
            int width = right - left;

            //4.2 get current hieght
            int currentHeight = Math.min(height[left], height[right]);

            // 4.3 multiply the height with the currentHeight
            int currentArea = width * currentHeight;

            // 4.4 return maxArea
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer that points to the shorter line
            //4.5 if item at left is less than item at right increase left
            if (height[left] < height[right]) {
                left++;
            }
            //4.6 else increase right
            else {
                right--;
            }
        }

        // return maxArea
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = solution.maxArea(height);
        System.out.println("The maximum area of water the container can hold is: " + result); // Output: 49
    }
}

