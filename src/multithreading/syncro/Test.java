package src.multithreading.syncro;

public class Test {

    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread thread1 = new  MyThread(counter);
        MyThread thread2 = new  MyThread(counter);

        thread1.start();
        thread2.start();
        try {
            thread1.join();  // Ensures that the main thread waits for thread1 to finish
            thread2.join();// Ensures that the main thread waits for thread2 to finish

//            thread1.join() and thread2.join(): This makes sure that the main thread waits for both
//            thread1 and thread2 to finish their execution before printing the final count. Without join(),
//                    the main thread might print the count before the other threads have completed.
        }catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}
