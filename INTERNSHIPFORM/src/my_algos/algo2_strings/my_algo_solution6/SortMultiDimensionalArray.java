package my_algos.algo2_strings.my_algo_solution6;

public class SortMultiDimensionalArray {


    /*
    it is sorted already in their individual array
    so what you need to do is to sort them
     */

    private static int[] sortMultiArr(int[][] multiArr){

        // 1 init the resulting array with size of the multidimensional array populate it with value of zero
       int size = 0;

        for(int[] temp: multiArr){
            for(int _: temp) size++;
        }

        int[] resultingArr = new int[size];

        // to monitor the column increase
        int[] indexColumnCounter = new int[multiArr.length];

        // 2 get the first element of each sub array
        // 3 put it in a temporary array
        int[] tempArr = {multiArr[0][indexColumnCounter[0]],
                multiArr[1][indexColumnCounter[1]],
                multiArr[2][indexColumnCounter[2]]};

        // 4 pass the array to a function
        // 5 return an array whose first element is the index where the value is found and the second element is the value
        for (int i = 0; i < size; i++) {

            int[] indexAndMinVal = returnIndexAndValue(tempArr);

            // 6 update the resulting array starting from index 0 with the value from the array returned by the function
            resultingArr[i] = indexAndMinVal[1];

            // 7 use that index to select the next element from that particular array at that index.
            // 8 update the temp array with the new element replacing only the value that
            if(indexColumnCounter[indexAndMinVal[0]] < 2){
                indexColumnCounter[indexAndMinVal[0]] = indexColumnCounter[indexAndMinVal[0]] + 1;
                tempArr[indexAndMinVal[0]] = multiArr[indexAndMinVal[0]][indexColumnCounter[indexAndMinVal[0]]];

            }else{
                tempArr[indexAndMinVal[0]] = Integer.MAX_VALUE;
            }
            // 9 the repeat step 4 to 8 until the all numbers as been selected.

        }


        // 10 return result

        return resultingArr;
    }

    private static int[] returnIndexAndValue(int[] tempArr){
        int[] tempResult = {0,0};

        int index = 0;

        int currentMinVal = Integer.MAX_VALUE;

        for (int i = 0; i < tempArr.length; i++) {

            if(currentMinVal > tempArr[i]){
                currentMinVal = tempArr[i];
                index = i;
            }

        }

        tempResult[0] = index;
        tempResult[1] = currentMinVal;

        return tempResult;
    }

    public static void main(String[] args) {

        int[][] multiArr1 = { {4, 6, 9}, {0, 1, 3}, {8, 11, 13}};
        int[][] multiArr2 = { {4, 30, 34}, {81, 111, 130}, {2, 11, 31}};
        int[][] multiArr3 = {{10, 21, 43}, {14, 66, 109}, {80, 110, 130}};
        int[][] multiArr4 = {{0, 101, 300}, {34, 96, 99}, {80, 110, 132}};




       int[] testing1 =  sortMultiArr(multiArr1);  //[0,1,3,4,6,8,9,11,13]
       int[] testing2 = sortMultiArr(multiArr2); //[2,4,11,30,31,34,81,111,130]
        int[] testing3 = sortMultiArr(multiArr3);  //[10,14,21,43,66,80,109,110,130]
       int[] testing4 =  sortMultiArr(multiArr4); //[0,34,80,96,99,101,110,132,300]


        print(testing2);
        System.out.println();
        System.out.println("*****************");
        print(testing1);
        System.out.println();
        System.out.println("*****************");
        print(testing3);
        System.out.println();
        System.out.println("*****************");
        print(testing4);
        System.out.println();
        System.out.println("*****************");

    }

    private static void print(int[] resultingArr){
        System.out.print("[ ");
        for (int i = 0; i < resultingArr.length; i++) {
            System.out.print(resultingArr[i]);
            if(i < resultingArr.length-1)
                System.out.print(", ");

        }
        System.out.print(" ]");
    }
}
