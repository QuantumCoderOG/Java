package src.reflection;

import java.lang.reflect.Field;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {
        Bottle bottle = new Bottle("Glass", 1.5);

//        Class<?> bottleClass = Bottle.class;               // From the class type
//        Class<?> bottleClass2 = new Bottle().getClass();   // From an object
//        Class<?> bottleClass3 = Class.forName("Bottle");

        // Get the Class object
        Class<?> bottleClass = bottle.getClass();

        // Access private field "material"
        Field materialField = bottleClass.getDeclaredField("material");
        materialField.setAccessible(true);  // Allow access to private fields

        // Get and set field values
        String material = (String) materialField.get(bottle);
        System.out.println("Material before: " + material);

        // Modify the private field
        materialField.set(bottle, "Plastic");
        System.out.println("Material after: " + materialField.get(bottle));
    }

}
