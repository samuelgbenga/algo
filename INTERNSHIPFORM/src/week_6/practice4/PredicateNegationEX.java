package week_6.practice4;

import java.util.function.Predicate;

public class PredicateNegationEX {

    public static void main(String[] args) {

        Integer number  = 14;

        Predicate<Integer> predicate = p -> p > 10;

        boolean isALie = doNegatePredicate(number , predicate);

        System.out.println("is the number less than 10: "+ isALie);

    }

    static boolean doNegatePredicate(Integer number, Predicate<Integer> predicate){
        return predicate.negate().test(number);
    }

}
