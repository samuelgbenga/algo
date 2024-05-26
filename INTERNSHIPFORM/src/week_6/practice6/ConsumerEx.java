package week_6.practice6;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        Consumer<String> consumer1 = (str) -> System.out.println(str + " this is it.");
        Consumer<String> consumer2 = (str) -> System.out.println(str + " this is not it.");

       // consumer1.accept("what do you take me for, ");
       // consumer2.andThen(consumer1).accept("What can you say for yourself,");

        BiConsumer<String, Integer> consumer3 = (str, num) -> System.out.println("My name is "+str+" I am "+num+" years old.");

        consumer3.accept("Samuel", 300);


    }
}
