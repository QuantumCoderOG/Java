package src.anonymousclass;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        // Creating an anonymous class that implements the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, world!");
            }
        };

        // Using the anonymous class
        greeting.sayHello();  // Outputs: Hello, world!
    }
}