package week_6.practice8;

import week_6.practice3.*;

import java.util.function.UnaryOperator;

public class UnaryOperatorEX {

    public static void main(String[] args) {
        Person person = new Person();
        UnaryOperator<Person> operator = p->{
            p.name = "samuel";
            p.age = 123;
            return p;
        };

        operator.apply(person);

        System.out.println("My name is "+ person.getName()+" i am "+person.getAge()+" years Old." );
    }
}

class Person{
     String name;
     int age;

     public Person(){};
     public Person(String name, int age){
         this.name = name;
         this.age = age;
     };

     public void setName(String name){
         this.name = name;
     }
     public void setAge(int age){
         this.age = age;
     }
     public String getName(){
         return name;
     }
     public int getAge(){
         return age;
     }

}
