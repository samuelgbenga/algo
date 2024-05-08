package Testing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,10}; // the missing value is six
        //int[]  arr1 = {1,2,3,4,5,6,7,8,9,10,11};

        int flagIfStatement = 0;

            for(int i = 0; i< arr.length; i++){

                    if(flagIfStatement == 0){

                        if(arr[i] == i + 2 ){
                            { System.out.println(i+1);}
                            flagIfStatement++;
                        }else if (arr[i] == i + 3) {
                            {
                                System.out.println(i + 1);
                            }
                            flagIfStatement++;
                        }

                    }
                    if(flagIfStatement == 1) {
                        if (arr[i] == i + 3) {
                            {
                                System.out.println(i + 2);
                            }
                            flagIfStatement++;
                        }

                    }



    }
     System.out.println();




     //for(int i=0;)
}
}
