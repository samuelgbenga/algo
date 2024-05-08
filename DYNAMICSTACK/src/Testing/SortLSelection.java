package Testing;

import java.util.Arrays;

public class SortLSelection {

    public static void main(String[] args) {
        // do it again


        int[] arr = {2,4,6,8,5,4,3,55,7};
        System.out.println(Arrays.toString(arr));

        // the loop
        for(int i = 0 ; i < arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1 ; j< arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }

}
