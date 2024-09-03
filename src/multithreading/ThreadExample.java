package src.multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
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