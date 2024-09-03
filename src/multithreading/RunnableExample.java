package src.multithreading;

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }

//    Explanation:
//
//    MyRunnable class implements Runnable and provides the implementation of the run() method.
//    Thread thread1 = new Thread(runnable); creates a new thread using the runnable object.
//            thread1.start() and thread2.start() start the threads.
}