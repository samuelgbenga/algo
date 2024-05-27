package week_6.practice.practice7;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEX {
    public static void main(String[] args) {
        Function<Integer, Integer> intToString = (num)-> (num+ num);
        Function<Integer, Integer> doMath = (num)-> num+2;
         int num = intToString.andThen(doMath).apply(30);


        System.out.println(num);
        System.out.println("******************");
        BiFunction<Integer, Integer, String> biFunction = (x, y)-> x*y+"";

        String str = biFunction.apply(4,3);
        System.out.println(str);

    }
}
