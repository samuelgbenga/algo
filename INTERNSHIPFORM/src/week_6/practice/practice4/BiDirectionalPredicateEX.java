package week_6.practice.practice4;

import java.util.function.BiPredicate;

// Declarative style of coding is awesome
public class BiDirectionalPredicateEX {
    public static void main(String[] args) {
        Person person = new Person("sam", 34);
        boolean checkPersonAge = predicateCheckAge(person, 12, (p, minAge)-> p.getAge() > minAge);

        System.out.println("Lets see the result: "+ checkPersonAge);

    }

    static boolean predicateCheckAge(Person person, int minAge, BiPredicate<Person, Integer> predicate){
        return predicate.test(person, minAge);
    }
}

