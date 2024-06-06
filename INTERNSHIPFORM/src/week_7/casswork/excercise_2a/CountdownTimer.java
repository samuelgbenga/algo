package week_7.casswork.excercise_2a;

public class CountdownTimer extends Thread{

    @Override
    public void run() {

        int i = 10;
            try {
                System.out.println(i--);
                sleep(1000);
                System.out.println(i--);
                sleep(1000);
                System.out.println(i--);
                sleep(1000);
                System.out.println(i--);
                sleep(1000);
                System.out.println(i--);
                sleep(1000);
                System.out.println(i--);
                sleep(1000);
                System.out.println(i--);
                sleep(1000);
                sleep(1000);
                System.out.println(i--);
                sleep(1000);
                System.out.println(i--);
                sleep(1000);
                System.out.println(i--);
                sleep(1000);
                System.out.println(i);
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }




    }

}
class Main{
    public static void main(String[] args) {
        CountdownTimer countdownTimer = new CountdownTimer();
        countdownTimer.start();
        try {
            countdownTimer.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("CountdownTime Completed");
    }
}
