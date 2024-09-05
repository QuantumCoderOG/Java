package src.multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
        //    System.out.println("RUNNING");
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

