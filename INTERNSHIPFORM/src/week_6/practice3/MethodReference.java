package week_6.practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.List;

public class MethodReference {
/*
method referencing operator.
        ::
 */


    public static void main(String[] args) {
        //System.out.println("samuel");
        Person a = new Person("kevin");
        Person b = new Person("mavin");
        Person c = new Person("mako");


        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Person> persons = Arrays.asList(a,b,c);

        //numbers.forEach(System.out::println);
        //numbers.forEach((num)-> System.out.println(num));
       // persons.forEach(System.out::println);

        persons.stream().map(Person::toString).forEach((m)->System.out.println(m));



    }

}
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
