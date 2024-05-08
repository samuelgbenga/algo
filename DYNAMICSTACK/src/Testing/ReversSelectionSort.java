package Testing;

import java.util.Arrays;

public class ReversSelectionSort {
    public static void main(String[] args) {

        int[]  arr = {23,34,5,6,456,5,1};

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length-1; i++){
            int maxNoIndex = i;
            for(int j= maxNoIndex; j < arr.length; j++){
                if(arr[j] > arr[maxNoIndex]){
                    maxNoIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxNoIndex];
            arr[maxNoIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
