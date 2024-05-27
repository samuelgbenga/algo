package week_6.practice.practice4;

import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {

        Person person1 = new Person("cartoon", 31);

        Predicate<Person> lessThan = (p)-> p.getAge() < 60;
        Predicate<Person> greaterThan = (p)-> p.getAge() > 20;

        Predicate<Person> predicate = lessThan.and(greaterThan);

        boolean isEligibility = isLegibleByAge(person1, predicate);

        System.out.println("is " + person1 +" Eligible: "+isEligibility);

    }

    static boolean isLegibleByAge(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }
}


class Person{
    private final String name;
    private final int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return ("[ "+name +" "+age+ " ]");
    }
}
