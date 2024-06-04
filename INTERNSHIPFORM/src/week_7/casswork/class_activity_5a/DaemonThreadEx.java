package week_7.casswork.class_activity_5a;

public class DaemonThreadEx implements Runnable {
    //check for daemon thread


    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread is present");
        }else {
            System.out.println("User thread is present");
        }
    }

    public static void main(String[] args) {

        DaemonThreadEx t1 = new DaemonThreadEx();
        Thread t4 = new Thread(t1);
        DaemonThreadEx t2 = new DaemonThreadEx();
        Thread t5 = new Thread(t2);

        DaemonThreadEx t3 = new DaemonThreadEx();
        Thread t6 = new Thread(t3);

        // set t1 to a daemon thread
        t4.setDaemon(true);

        t4.start();
        t5.start();
        t6.start();

    }

}
