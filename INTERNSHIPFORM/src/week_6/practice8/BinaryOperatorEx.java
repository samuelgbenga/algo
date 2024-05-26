package week_6.practice8;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {
    public static void main(String[] args) {
        Person person1 = new Person("name", 23);
        Person person2 = new Person("Ade", 45);

        BinaryOperator<Person> biOperator = (p1, p2)->{
            p1.name = p2.getName();
            p1.age = p2.getAge();
            return p1;
        };

        biOperator.apply(person1, person2);
        System.out.println(person1.getAge()+ " this is it " + person1.getName());

    }
}
