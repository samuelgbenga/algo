package my_algos.algo2_strings.my_algo_solution4;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        //1 it right
        int left = 0;

        //2 init left
        int right = height.length - 1;

        //3 init resulting area
        int maxArea = 0;

        //4 loop while left is less than right
        while(left < right){

            //4.1 get the current width
            int width = right - left;

            //4.2 compare and get the highest hight
            int currentMaxHeight = Math.min(height[left], height[right]);

            //4.3 get the temporary area for now
            int tempArea = width * currentMaxHeight;

            //4.4 assign the temporary arear to the previously declared final result if it is higher incomparsim
            maxArea = Math.max(tempArea, maxArea);

            //4.5 increase left if hight at left is lesser than hight at right
            if(height[left] < height[right]){
                left++;
            }

            //4.6 else decrease from right if oposite is the case
            else {
                right--;
            }



        }


        //5 return final result
       return maxArea;

    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = solution.maxArea(height);
        System.out.println("The maximum area of water the container can hold is: " + result); // Output: 49
    }
}
