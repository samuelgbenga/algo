package algo1;

import java.util.Arrays;
import java.util.Objects;

public class Algo1 {

    public static void main(String[] args) {

        String[] test = {"he healing ahead heading", "h", "e"};
        String[] words = test[0].split("\\s+");
        String str1 = test[1];
        String str2 = test[2];
        boolean check = true;


        while(check){

            for(String word1: words){
                //System.out.println(word1);
                if(!checkLastIndex(word1, str1)){

                    check = checkNextElem(word1, str1, str2);
                    //System.out.println(check);
                    if(!check){
                        //System.out.println(check);
                        break;
                    }
                }
            }

            System.out.println(check);
            check = false;
        }

    }

    static boolean checkNextElem(String word, String firstElem, String nextElem){

        int firstElemIndex = word.indexOf(firstElem);
        char char1 = word.charAt(firstElemIndex+1);
        String str = Objects.toString(char1);

        return str.equals(nextElem);
    }


    static boolean checkLastIndex(String word, String firstElement){

        char lastChar = word.charAt(word.length()-1);
        String str1 = Objects.toString(lastChar);

        return firstElement.equals(str1);

    }
}
