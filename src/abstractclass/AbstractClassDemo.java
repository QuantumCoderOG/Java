package src.abstractclass;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Outputs: The dog barks.
        myDog.eat();   // Outputs: This animal eats food.

        myCat.sound(); // Outputs: The cat meows.
        myCat.eat();   // Outputs: This animal eats food.
    }

    //Can have both abstract and concrete methods
    //A class can extend only one abstract class
    //Can have constructors
    //Can have instance variables
    //Can have any access modifier (public, protected, private)
    //Used when classes share a common base with some shared code
    //Subclasses extend the abstract class
}