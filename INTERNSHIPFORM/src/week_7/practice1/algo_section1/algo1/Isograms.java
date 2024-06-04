package week_7.practice1.algo_section1.algo1;

import java.util.HashSet;
import java.util.Locale;
import java.util.stream.IntStream;

public class Isograms {


    public static boolean isIsogram(String str){

        if(str.length()==0) return true;

        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        HashSet<Character> characters = new HashSet<>();


        for(char a: arr) characters.add(a);
        return characters.size() == str.length();

    }

    public static void main(String[] args) {

        //System.out.println("hello world");
        String str = "samuell";

        System.out.println(isIsogram(str));
    }
}
