package week_7.practice1.algo5;

public class RomanNumerals {

    class Solution {
        public int romanToInt(String s) {
            s = s.toUpperCase();
            int result = 0;
            String[] strArr = s.split("");
            int i = 1;
            for(String a: strArr) {
                int firstNum = startNumber(strArr[i]);
                if(firstNum <= startNumber(a)){
                    result += startNumber(a);
                }
                else{
                    result = result-startNumber(a);
                }
                System.out.println(i);
                if(i < strArr.length-1)
                    i++;
            }

            return result;
        }
        private int startNumber(String a){
            switch(a){
                case "I":return 1;
                case "V":return 5;
                case "X":return 10;
                case "L":return 50;
                case "C":return 100;
                case "D":return 500;
                case "M":return 1000;
                default: return -1;
            }
        }
}
}
