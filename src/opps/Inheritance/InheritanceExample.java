package src.opps.Inheritance;


public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat(); // Inherited method
        dog.bark(); // Method from Dog class
    }
//    Inheritance is a mechanism wherein a new class (child or subclass) inherits the properties
//    and behavior of an existing class (parent or superclass). It allows for code reusability
//    and the creation of a hierarchical relationship between classes.
//
//            Explanation:
//    The Animal class is the parent class that contains a common method eat().
//    The Dog class is the child class that inherits from Animal and adds a new method bark().
//    The Dog object can use both the inherited eat() method and its own bark() method.
}