package algo;

import java.math.BigInteger;

public class MySolutionToNInes {

    public static int findNines(int k){
        int i = 0;
        int result;

        for(;; i++) {
            result = k * i;

            int ones = (result % 9 == 0) ? result / 9 : 0;
            if (ones == 0) continue;

            String str = "" + ones;
            int sumOfOnes = 0;

            // get the length of the number
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(0) != str.charAt(j)) {
                    sumOfOnes = 0;
                    break;
                }
                sumOfOnes += str.charAt(j) - '0';
            }

            if (sumOfOnes == str.length()) {
                return i;  // Return the value of i
            }

            if (result >= Integer.MAX_VALUE / 2) {
                return -1;  // Return -1 if the result exceeds the threshold
            }
        }
    }


    public static void main(String[] args) {

//        BigInteger name = BigInteger.valueOf(1234);
//
//        BigInteger bi = new BigInteger("23445");
//
//        int num = bi.intValue();
//
//        System.out.println(num);
//
//        System.out.println(BigInteger.valueOf(1234));

        System.out.println(findNines(17));

        }

}
