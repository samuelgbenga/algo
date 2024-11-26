package my_algos.algo2_strings.polish_notation;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReversePolishNotation {


    public static void main(String[] args) {

        String[] chaArr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};


        int resultLength = chaArr.length;
        String result  = null;


        // to loop throught the array while we have not gotten result yet
        while (resultLength != 1){

            chaArr = latestCopy(chaArr);

            resultLength = chaArr.length;

            if(resultLength == 1) result = chaArr[0];
        }


        System.out.println(result);
    }


    // my solution.
    private static String[] sliceArr(String[] strArr, int index , String result){

        String[] tempArrL = Arrays.copyOfRange(strArr, 0, index-2);
        String[] tempArrR = Arrays.copyOfRange(strArr, index+1, strArr.length);
        String[] resultArr = {result};

        String[] tempResult = Stream.concat(Stream.concat(Stream.of(tempArrL), Stream.of(resultArr)), Stream.of(tempArrR)).toArray(String[]::new);

        return tempResult;
    }

    // to know the operation
    private static String operatorOrString(String elem){

        switch (elem){
            case "*":
            case "+":
            case "-":
            case "/": return "operator";
            default: return "integer";
        }
    }


    private static String doTheMath(String a, String b, String operator){

        int resultInt = 0;
        try{
            int intA  = Integer.parseInt(a);
            int intB = Integer.parseInt(b);

            switch (operator){
                case "*":
                    resultInt = intA * intB;
                    break;
                case "+":
                    resultInt = intA + intB;
                    break;
                case "/":
                    resultInt = intA / intB;
                    break;
                case "-":
                    resultInt = intA - intB;
                    break;
                default:
                    break;

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return resultInt + "";

    }


    // return latest copy of array
    private static String[] latestCopy(String[] chaArr){
        int count = 0;

        String[] temp = null;

        // push the elements into the temp array
        for(int i = 0; i< chaArr.length; i++){
                // this function returns the result.
            if(operatorOrString(chaArr[i]) == "operator" && count >= 2){

                String tempResult = doTheMath(chaArr[i-2], chaArr[i-1], chaArr[i]);

                temp = sliceArr(chaArr, i, tempResult);

                break;

            }
                count++;
        }

        return temp;
    }

}

/* study this solution later


 */


