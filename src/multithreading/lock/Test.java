package src.multithreading.lock;

public class Test {
    public static void main(String[] args) {
        CounterLock counter = new CounterLock();
        MyThreadLock thread1 = new MyThreadLock(counter);
        MyThreadLock thread2 = new MyThreadLock(counter);

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(500);  // Let the threads run for a while
           thread1.interrupt();  // Interrupt thread1 while it's potentially waiting for the lock
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
