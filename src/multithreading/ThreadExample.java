package src.multithreading;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
//        MyThread thread = new MyThread();
//        System.out.println(thread.getState());
//        MyThread thread1 = new MyThread();
//
//        thread.start(); // Start the first thread
//        thread1.start(); // Start the second thread

//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState()); // NEW
//        t1.start();
//        System.out.println(t1.getState()); // RUNNABLE
//        Thread.sleep(100);
//        System.out.println(t1.getState()); // TIMED_WAITING
//        t1.join();
//        System.out.println(t1.getState()); // TERMINATED

        MyThread myThread = new MyThread();
        myThread.setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now
        MyThread t1 = new MyThread();
        t1.start(); // t1 is user thread
        myThread.start();
        System.out.println("Main Done");


//        Daemon vs. User Threads:
//        User Thread: These are the threads that keep the JVM running. The JVM will not exit as long as there are any user threads still alive.
//                User threads are the default type of thread.
//
//                Daemon Thread: These threads are meant for background tasks.
//        When the JVM detects that all user threads have finished executing, it will terminate all daemon
//        threads and exit, even if the daemon threads haven't completed their tasks.
    }
}


//Explanation:
//
//        MyThread class extends Thread and overrides the run() method.
//        In the run() method, we print the current thread’s name and a loop counter.
//        Thread.sleep(1000) pauses the execution of the thread for 1 second.
//        thread1.start() and thread2.start() begin the execution of the two threads concurrently.


//    start(): Starts the execution of the thread by invoking the run() method.
//        run(): Contains the code to be executed by the thread.
//        sleep(long milliseconds): Causes the current thread to sleep (pause execution) for the specified number of milliseconds.
//        join(): Waits for a thread to die.
//        yield(): Causes the currently executing thread object to temporarily pause and allow other threads to execute.
//        interrupt(): Interrupts a thread.
//        setPriority(int priority): Changes the priority of a thread.