package src.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMethodDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BottleNew bottle = new BottleNew("Glass");

        // Get the Class object
        Class<?> bottleClass = bottle.getClass();

        // Invoke the public method

        Method getMaterialMethod = bottleClass.getMethod("getMaterial");
        String material = (String) getMaterialMethod.invoke(bottle);
        System.out.println("Material: " + material);

        // Get the private method 'printDetails'
        Method printDetailsMethod = bottleClass.getDeclaredMethod("printDetails");
        printDetailsMethod.setAccessible(true);  // Allow access to private method
        printDetailsMethod.invoke(bottle);
    }
}
