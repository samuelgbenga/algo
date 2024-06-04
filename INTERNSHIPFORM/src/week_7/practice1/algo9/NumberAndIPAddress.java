package week_7.practice1.algo9;

import java.math.BigInteger;
import java.util.*;

public class NumberAndIPAddress {

    // convert back to decimal or ip
    public static String numberAndIPaddress(String s) {

        //if(s.length()>9 && s.charAt(0) != '1') return s;

        String[] stringByte = s.split("\\.");



        if(stringByte.length < 4){

            //System.out.println(stringByte.length);

            BigInteger decimal = new BigInteger(s);
            String str = decimal.toString(2);
            //String str = Integer.toBinaryString(Integer.parseInt(s));

            System.out.println(str.length());
            if(str.length() != 32){
                str = String.format("%32s", str).replace(' ', '0');
                System.out.println(str);
            }

            //System.out.println(str);
            String sub = "";
            String newStr="";

            for(int i = 0; i < str.length()/8; i++){
                int start = i*8;
                sub = str.substring(start, start+8);
                //System.out.println(sub);
                newStr += "."+Integer.parseInt(sub, 2);
            }
            System.out.println(newStr.substring(1, newStr.length()));
            return newStr.substring(1, newStr.length());
        }


        // String[] stringByte = s.split("\\.");
        //System.out.println(stringByte.length);
        //convert to binary
        String str = "";
        for(String e: stringByte){
            int i = Integer.parseInt(e);
            String str1 = Integer.toBinaryString(i);
            String padStr1 = String.format("%8s", str1).replace(' ', '0');
            //1010: _ _ _ _1010 replace them 0; 00001010
            //System.out.println(padStr1);

            str += padStr1;



        }
        //System.out.println(Integer.parseInt(str, 2));
        s = ""+ Integer.parseInt(str, 2);
        //System.out.println(s.substring(0,4));

        return s;


    }

    public static void main(String[] args) {
        System.out.println(numberAndIPaddress("3278640108"));
        System.out.println(Integer.MAX_VALUE < 913233936);

    }
}
