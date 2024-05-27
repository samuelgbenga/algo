package week_6.class_activity1b;

public class WithLambdaExpression {
    public static void main(String[] args) {

        SayName s1 = (name)-> "Hello " + name;

        System.out.println(s1.sayName("Samuel"));

        SayName.doItOutThere();
    }

}

@FunctionalInterface
interface SayName{

     String sayName(String name);
     private static void doThisHere(){
         System.out.println("hello world");
     }


     static void doItOutThere(){
         doThisHere();
     }

}