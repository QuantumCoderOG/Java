package src.anonymousclass;

public class AnonymousClassDemo2 {
    public static void main(String[] args) {
        // Creating an anonymous class that extends the Animal class
        Animal myAnimal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("The dog barks");
            }
        };

        // Using the anonymous class
        myAnimal.makeSound();  // Outputs: The dog barks
    }
}