package week_4.class_assignment;

public class ExceptionHandlingEx {

    /*
    create a class, inside your class your psvm, indide your psvm
    declare three variables with int data type num1, num2, num3.
    Assign 50 and 0 to num1 and num2. num3 should not be assigned
    any number for now. divide num1 by num2, and assigned it to num3.
    should not be assigned any number for now. Divide num1 by num2,
    and assigned it to num3. Knowing that this might cause an
    exception since 50 cannot be divided by 0, do the division inside
    a try-catch block, while you will resolve the exception inside
    your catch block by printing out num1 divide by num2 plus 2.
    you should print out 25 to the console if your exception is
    handled correctly.

     */

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 0;
        int num3;



        try {
            num3 = num1/num2;
            System.out.println(num3);

        }catch (Exception e){

            num2 = num2 + 2;
            num3 = num1/num2;

            System.out.println(num3);
        }

    }

}
