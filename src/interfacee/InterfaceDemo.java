package src.interfacee;

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();  // Outputs: The dog barks.
        myDog.eat();    // Outputs: The dog eats bones.

        myCat.sound();  // Outputs: The cat meows.
        myCat.eat();    // Outputs: This animal eats food.

        // Calling the static method from the interface
        Animal.sleep(); // Outputs: This animal sleeps at night.
    }

    //Can have only abstract methods (except default and static)
    //A class can implement multiple interfaces
    //Cannot have constructors

    //Cannot have instance variables
    //Methods are public by default; cannot have other modifiers
    //Used to define a contract that multiple classes can implement
    //Classes implement the interface
}
