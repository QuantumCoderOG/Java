package src.interfacee;

interface Animal {
    // Abstract method (no body)
    void sound();

    // Default method (has a body)
    default void eat() {
        System.out.println("This animal eats food.");
    }

    // Static method (has a body)
    static void sleep() {
        System.out.println("This animal sleeps at night.");
    }

}
