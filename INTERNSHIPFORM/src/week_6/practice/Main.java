package week_6.practice;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> evenList = Arrays.asList(1,2,3,4,5,6,7);

        evenList.stream().filter((i)-> i%2 == 0 ).forEach(System.out::println);
    }
}
