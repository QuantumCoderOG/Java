package src.reflection;

import java.lang.reflect.Constructor;

public class ReflectionConstructorExample {

    public static void main(String[] args) {

        try {
            // Step 1: Get the Class object for Bottle
            Class<?> bottleClass = Bottle.class;// here same package thats why

            // Step 2: Get the Constructor object for the constructor with parameters
            Constructor<?> constructor = bottleClass.getConstructor(String.class, double.class);

            // Step 3: Create a new instance using the constructor
            Object bottleInstance = constructor.newInstance("Glass", 1.5);

            // Step 4: Cast the object back to Bottle type (if necessary)
            Bottle bottle = (Bottle) bottleInstance;

            // Step 5: Call a method on the new instance
            bottle.displayDetails();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
