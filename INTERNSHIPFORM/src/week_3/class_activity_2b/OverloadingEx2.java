package week_3.class_activity_2b;

public class OverloadingEx2 {
    static int add(int a, int b){
        return a+b;
    }

    static String add(int a, int b, int c){

        return "hello world" + a + b + c + "what is happening";
    }
}
