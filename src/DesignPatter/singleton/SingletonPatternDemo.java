package src.DesignPatter.singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // Illegal to instantiate the Singleton directly:
        // Singleton obj = new Singleton(); // This will cause a compilation error

        // Get the only object available
        Singleton singleton = Singleton.getInstance();

        // Show a message
        singleton.showMessage();
    }
}