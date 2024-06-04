package week_7.casswork.class_activity_1a;

public class ThreadStateEx implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The state of thread t1 while it invoked the join() " + "method on thread t2"+ ThreadState.t1.getState());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class ThreadState implements Runnable {
    public static Thread t1;

    public static ThreadState obj;

    @Override
    public void run() {
        ThreadStateEx threadStateEx = new ThreadStateEx();
        Thread t2 = new Thread((threadStateEx));

        // thread t2 is created and currently in the new state
        System.out.println("The state of thread t2 after spamming it " + t2.getState());
        t2.start();

        //thread t2 is saved to the runnable state
        System.out.println("the state of thread t2 after calling the method start() on it " + t2.getState());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("the state of thread t2 after calling the method sleep() on it " + t2.getState());

        try {
            // waiting for thread t1 to complete its execution
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("the state of thread t2 after calling the method join() on on completing its" +
                "execution " + t2.getState());


    }

    public static void main(String[] args) {

        obj = new ThreadState();
        t1 = new Thread(obj);


        // the thread t1 is currently in the new state
        System.out.println("The state of thread t1 after creating it -"+ t1.getState());

        //invoke the start method on t1
        t1.start();
        System.out.println("The state of thread t1 after invoking start() method -"+ t1.getState());


    }
}
