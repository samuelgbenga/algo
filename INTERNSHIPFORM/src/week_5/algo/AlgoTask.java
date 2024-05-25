package week_5.algo;

import java.util.ArrayList;

public class AlgoTask {


    public static int packArray(ArrayList<Integer> integers) {

        // Step 1. Loop through the array list until the size of the integers list is greater than 1
        for (int i = 0; integers.size() > 1; i++) {
            // Step 2. Create a new ArrayList to store the result of the current pass
            ArrayList<Integer> res = new ArrayList<Integer>();

            // Step 3. Iterate over the integers list in steps of 2
            for (int j = 0; j < integers.size(); j += 2) {
                // Step 4. Get the current pair of elements
                int x = integers.get(j);
                int y = integers.get(j + 1);

                // Step 5. Add the sum or product of the pair to the result list
                // Step 6. If i is even, add x + y; if i is odd, add x * y
                res.add(i % 2 == 0 ? x + y : x * y);
            }

            // Step 7. Update the integers list with the result list for the next pass
            integers = res;
        }

        // Step 8. Return the final remaining element in the list
        return integers.get(0);
    }

        // this is mine own algo
    public static int doAlgo(ArrayList<Integer> integers){

        int loopSize = 1;
        int testNum = 1;


        for (int i = 1; i <= integers.size()/2 ; i++) {
            testNum *= 2;

            if((testNum) == integers.size()) {

                loopSize = i;
                break;
            }
        }

        int tempSize = integers.size();

        for(int i = 0; i < loopSize; i++){

            if((i+1)%2!= 0){
                ArrayList<Integer> tempArr = new ArrayList<>();
                for(int j = 0; j < tempSize; j+=2){
                    int odd = integers.get(j) + integers.get(j+1);
                    tempArr.add(odd);
                }
                tempSize = tempSize/2;

                integers = tempArr;
            }
            else {

                ArrayList<Integer> tempArr = new ArrayList<>();
                for(int j = 0; j < tempSize; j+=2){
                    int even = integers.get(j) * integers.get(j+1);
                    tempArr.add(even);

                }

                tempSize = tempSize/2;
                integers = tempArr;
            }

        }


        return integers.get(0);
    }

    public static void main(String[] args) {
        /*
        Given an array of integers (for sum integer K, which will be between 0
        and 5 inclusive) Perfor the following operation untill the array contain only one element
        -if iteration number is odd perform sum for two consecutive numbers;
        -if iteration is even, multiply two consecutive numbers.
         */
        ArrayList<Integer> arr = new ArrayList<>();

//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
        
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);

        

        int result = packArray(arr);
        int result1 = doAlgo(arr);

        System.out.println(186==result);
        System.out.println(186== result1);



    }

}
