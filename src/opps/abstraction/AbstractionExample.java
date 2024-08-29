package src.opps.abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine(); // Abstract method implementation
        myCar.stopEngine();  // Concrete method from abstract class
    }

//    Abstraction is the concept of hiding the implementation details from the user and
//    showing only the essential features. It can be achieved using abstract classes or interfaces.
//
//            Explanation:
//    The Vehicle class is abstract and provides an abstract method startEngine() and a concrete method stopEngine().
//    The Car class extends Vehicle and provides an implementation for startEngine().
//    The myCar object uses the implemented method from Car and the concrete method from Vehicle.
}