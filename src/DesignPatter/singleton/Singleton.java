package src.DesignPatter.singleton;

public class Singleton {
    // Step 1: Create a private static variable to hold the single instance
    private static Singleton instance;

    // Step 2: Make the constructor private so that this class cannot be instantiated
    private Singleton() {
        // private constructor
    }

    // Step 3: Provide a public static method that returns the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(); // lazy initialization
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
