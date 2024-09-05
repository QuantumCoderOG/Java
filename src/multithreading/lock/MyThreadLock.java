package src.multithreading.lock;

class MyThreadLock extends Thread {
    private CounterLock counter;

    public MyThreadLock(CounterLock counter) {
        this.counter = counter;
    }

    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {
                counter.increaseCount();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while waiting for the lock.");
        }
    }
}
