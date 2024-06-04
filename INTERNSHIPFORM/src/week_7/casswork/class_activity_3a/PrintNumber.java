package week_7.casswork.class_activity_3a;

public class PrintNumber implements Runnable{

    private int start;
    private int end;

    public PrintNumber(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i = start; i<= end; i++){
            System.out.println(Thread.currentThread().getName()+ ": "+ i);

            //simulate some delays

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintNumber(1,5));
        Thread t2 = new Thread(new PrintNumber(6,10));

        t1.start();
        t2.start();
    }
}