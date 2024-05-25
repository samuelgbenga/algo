package week_5.class_excercise5b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        List<Integer> numbers = new ArrayList<>();


        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);



        fruits.add("fruit");
        fruits.add("fruit1");
        fruits.add("fruit2");
        fruits.add("fruit3");
        fruits.add("fruit4");


        Integer[] convert = numbers.toArray(new Integer[0]);

        String[] convertToArray = fruits.toArray(new String[0]);

        System.out.println(Arrays.toString(convertToArray));
        System.out.println(Arrays.toString(convert));
    }


}
