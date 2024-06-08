package week_7.practice1.algo1;

import java.util.ArrayList;


public class ReverseInteger {
    public static void main(String[] args) {
        int num = 42145;

        String str = ""+ num;
        String[] strArr = str.split("");

        ArrayList<Integer> intArr = new ArrayList<>();

        for(String s: strArr){
            intArr.add(Integer.parseInt(s));
        }

        System.out.println(intArr);
        intArr.sort((a,b)-> a<b? 1:-1);
        System.out.println(intArr);
        String strResult = "";
        for(int i: intArr){
            strResult+= i;
        }

        int finalResult = Integer.parseInt(strResult);

        System.out.println(finalResult);

    }
}
