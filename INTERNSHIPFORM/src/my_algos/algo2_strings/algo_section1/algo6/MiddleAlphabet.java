package my_algos.algo2_strings.algo_section1.algo6;

public class MiddleAlphabet {


    class Kata {
        public static String getMiddle(String word) {
            // returns the middle element and returns two if the number is even in length;
            int length = word.length();
            return (length%2 != 0)? ""+word.charAt(length/2):
                    ""+word.charAt(length/2-1)+word.charAt(length/2) ;
        }
    }
}
