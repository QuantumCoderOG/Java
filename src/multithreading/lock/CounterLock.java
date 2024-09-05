package src.multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CounterLock {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increaseCount() throws InterruptedException {
        lock.lockInterruptibly();  // Allows thread to be interrupted while waiting for the lock
        try {
            count++;
        } finally {
            lock.unlock();  // Always release the lock
        }
    }

    public int getCount() {
        return count;
    }
}
