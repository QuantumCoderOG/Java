package src.opps.polymorphism;

public class PolymorphismMethodOverRidingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Polymorphism
        myAnimal.sound(); // Dog's sound method is called
    }

//    Polymorphism allows methods to do different things based on the object
//    it is acting upon, even if they share the same name. It can be achieved in two ways:
//    method overriding (runtime polymorphism) and method overloading (compile-time polymorphism).
//    Explanation:
//    The Dog class overrides the sound() method of the Animal class.
//    The myAnimal object is of type Animal but is instantiated as a Dog. When sound() is called,
//    the overridden method in Dog is executed.
}
