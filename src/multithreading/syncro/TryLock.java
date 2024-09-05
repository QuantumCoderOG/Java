package src.multithreading.syncro;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {

    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increaseCount() {
        try {
            if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {  // Wait for up to 100 ms to acquire the lock
                try {
                    count++;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Could not acquire the lock within the specified time.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    tryLock(): Returns immediately. If the lock is unavailable, it doesn't block.
//    tryLock(long time, TimeUnit unit): Allows waiting for a certain period to acquire the lock. If the lock is not available after the timeout, it returns false.
}
