package src.multithreading;

public class ThreadYieldTest {

    public static void main(String[] args) {
        ThreadYield t1 = new ThreadYield();
        ThreadYield t2 = new ThreadYield();
        t1.start();
        t2.start();
    //It’s important to note that yield() is just a hint to the thread scheduler,
        // and the actual behavior may vary depending on the JVM and OS.
    }
}
