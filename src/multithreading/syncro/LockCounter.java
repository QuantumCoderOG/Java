package src.multithreading.syncro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCounter {

    private int count = 0;
    private final Lock lock = new ReentrantLock();  // Create a ReentrantLock instance

    public void increaseCount() {
        lock.lock();  // Acquire the lock
        try {
            count++;
        } finally {
            lock.unlock();  // Always release the lock in a finally block to avoid deadlocks
        }
    }

    public int getCount() {
        return count;
    }
}
