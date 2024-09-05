package src.DesignPatter.singleton;

import java.io.Serializable;

public class UnbreakableSingleton implements Serializable, Cloneable {

    // The volatile keyword ensures that multiple threads handle the instance variable correctly.
    private static volatile UnbreakableSingleton instance = null;

    // Private constructor to prevent instantiation
    private UnbreakableSingleton() {
        // Prevent instantiation via reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create instance");
        }
    }

    // Global access point to get the Singleton instance
    public static UnbreakableSingleton getInstance() {
        if (instance == null) {
            synchronized (UnbreakableSingleton.class) {
                if (instance == null) {
                    instance = new UnbreakableSingleton();
                }
            }
        }
        return instance;
    }

    // Prevent cloning from breaking Singleton
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning is not allowed");
    }

    // Prevent deserialization from breaking Singleton
    protected Object readResolve() {
        return getInstance();
    }
}
