package week_5.class_activities10a;

public class Main {

    public static <N> void genericMethod(N num1, N num2 ){

        String strNum1 = "" + num1;
        String strNum2 = "" + num2;
        System.out.println(strNum1 + strNum2);
    }

    public static void main(String[] args) {

        genericMethod("1", 3);
    }
}
