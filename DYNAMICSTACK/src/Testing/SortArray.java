package Testing;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        // sort element from start to finish

        int[] arr = {2,1,3,4,8,5,7,6};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }

                // the swap
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

            }

        }

        System.out.println(Arrays.toString(arr));

    }
}
