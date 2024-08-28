package src.map;

import java.util.Collection;
import java.util.HashMap;

public class MapValuesExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 1);
        map.put("Apple", 2);
        map.put("Mango", 3);
        map.put("Orange", 4);

        // Get the values from the map
        Collection<Integer> values = map.values();

        // Iterate over the values
        System.out.println("Values in the map:");
        for (Integer value : values) {
            System.out.println(value);
        }

        // Modifying values collection does not affect the map
        values.remove(3); // Attempting to remove a value directly from the collection

        System.out.println("\nMap after attempting to remove value 3:");
        System.out.println(map); // The map remains unchanged
    }

//    OUTPUT
//    Values in the map:
//            1
//            2
//            3
//            4
//
//    Map after attempting to remove value 3:
//    {Banana=1, Apple=2, Mango=3, Orange=4}
}
