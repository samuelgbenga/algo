package week_6.class_activity4a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pyramid {

    public static void main(String[] args) {

        List<String> pyramid = new ArrayList<>();


        pyramid.add("*****");
        pyramid.add("****");
        pyramid.add("**");
        pyramid.add("*");
        pyramid.add("***");
        pyramid.add("******");

        //pyramid.sort((p1, p2)-> Integer.compare(p1.length(), p2.length()));

        pyramid.sort(Comparator.comparingInt(String::length));

        pyramid.forEach(System.out::println);

    }
}
