package week_6.class_activity7a;


public class Main {
//
//   public static void talk(){
//        System.out.println("hello world");
//    };
//    public static void main(String[] args) {
//
//       // SaySomething sayAble = Main::talk;
//
//        sayAble.say("hello world");
//    }
}


@FunctionalInterface
interface SaySomething{

    void say(String msg);

}