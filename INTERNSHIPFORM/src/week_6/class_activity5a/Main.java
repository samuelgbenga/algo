package week_6.class_activity5a;

public class Main {

    public static void saySomething(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {

        SayAble sayAble = Main::saySomething;

        sayAble.say();
    }
}

interface SayAble{

    void say();


}
