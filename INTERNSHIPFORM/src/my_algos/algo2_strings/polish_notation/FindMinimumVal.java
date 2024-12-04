package my_algos.algo2_strings.polish_notation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindMinimumVal {



    private static int findUniqueVal(int[] newArr){



        // Step 1: Declare Hash Set 1 (result driven)
        Set<Integer> uniqueElements = new HashSet<>();

        // Step 2: Declare Hash Set 2 (monitor)
        Set<Integer> monitorSet = new HashSet<>();

        // 4 loop throuhg the array

        for(int num: newArr){
            // 5 if the element is not contained in the set2 do 5.1
            if(!monitorSet.contains(num)){
                if(uniqueElements.contains(num)){
                    uniqueElements.remove(num);
                    monitorSet.add(num);
                }
                else {
                    uniqueElements.add(num);
                }
            }
        }


            // 5.1 if the set1 contains the element already remove the element from the set and push the removed element into set2
            // 5.2 else the push the element into the set1

       // System.out.println(uniqueElements);



        return uniqueElements.iterator().hasNext()  ? uniqueElements.iterator().next(): -1;
    }


    public static void main(String[] args) {
        System.out.println("hello world");


        int[] newArr = new int[]{1,1,1,2,2,3,3,4,4,4,5,5,6,6};

        int result = findUniqueVal(newArr);

        System.out.println(result == -1 ? "No unique element can be found": result  );
    }
}
