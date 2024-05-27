package week_6.class_activity2a;

public class LambdaWithMultipleParams {

    public static void main(String[] args) {

        Addable a1 = (x,y)-> x+y;
        System.out.println(a1.add(2,3));


    }

}

@FunctionalInterface
interface Addable{
    int add(int a, int b);
}