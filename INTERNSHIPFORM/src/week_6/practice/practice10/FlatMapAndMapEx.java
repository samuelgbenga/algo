package week_6.practice.practice10;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapAndMapEx {

    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5);

        //list.stream().flatMap(i-> Stream.of(i+10,i+20,i+30)).forEach(System.out::println);

        // you can use flatMap to compare multiple arrays. its amazing how it works.

        int[] arr1 = new int[]{1,2,3,4,5,7}, arr2 = new int[]{5,6,7,8,2,4},
                arr3 = new int[]{15,16,17};

//        Stream.of(arr1, arr2, arr3).flatMapToInt((a)-> IntStream.of(a)).
//                max().ifPresent(System.out::println);

        Stream.of(arr1, arr2, arr3).flatMapToInt((a)-> IntStream.of(a)).
                map(a-> a*2).forEach(System.out::println);
        // this would not work same for just map

        Arrays.stream(arr2).max().ifPresent(System.out::println);


        //Stream.of(arr1).map((a,b)-> a>b).max((a,b)-> a>b).ifPresent(System.out::println);
    }
}
