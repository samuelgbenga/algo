package Testing;

import java.util.Arrays;

public class ArrangeZeros {

    /*
    This is how the project will run
    you check for zero
    if zero is found
    switch the position of the zero to last position on the array linearly
                    move the zero one index at a time till the last index
                    reduce the last position by one
     repeat the process again

     */
    public static void main(String[] args) {

        int[] arr = {0,0,3,0,5,0,3,0,3,4,5};
        System.out.println(Arrays.toString(arr));
        int padding = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i]==0){

                for(int j =i; j<arr.length - padding; j++ ){
                    if(arr[j] == arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        if(j == i){padding++;}
                    }
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    if(j == i){padding++;}
                }

            }
            //System.out.print(arr.length);
        }

       System.out.println(Arrays.toString(arr));

//4w"ik7!#Re?R8vD   samuel.joseph@decagon.dev
    }
}
