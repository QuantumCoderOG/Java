package src.solid.dependency_inversion;

public class DependencyInversionLightBulb implements Switchable {
    public void turnOn() {
        System.out.println("LightBulb turned on");
    }

    public void turnOff() {
        System.out.println("LightBulb turned off");
    }

    //    Definition: High-level modules should not depend on low-level modules. Both should depend on abstractions
//            (e.g., interfaces).
//    Abstractions should not depend on details. Details should depend on abstractions.

//    Explanation: The first implementation violates DIP because the Switch class is tightly coupled
//        to the LightBulb class. In the second implementation,
//    the Switch class depends on the Switchable interface, making it more flexible and reusable.
}