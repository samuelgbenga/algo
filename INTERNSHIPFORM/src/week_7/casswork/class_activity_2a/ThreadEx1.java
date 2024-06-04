package week_7.casswork.class_activity_2a;

public class ThreadEx1 extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is currently running: ");
    }

    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1();


        t1.start();


    }
}
