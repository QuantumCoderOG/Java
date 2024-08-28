package src.map;

import java.util.HashMap;
import java.util.Set;

public class KeySetExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 1);
        map.put("Apple", 2);
        map.put("Mango", 3);
        map.put("Orange", 4);

        // Get the keySet from the map
        Set<String> keySet = map.keySet();

        // Iterate over the keys using the keySet
        System.out.println("Keys in the map:");
        for (String key : keySet) {
            System.out.println(key);
        }

        // Modifying the keySet will reflect in the map
        keySet.remove("Mango");
        System.out.println("\nAfter removing 'Mango' from the keySet:");

        // Printing the map after modification
        System.out.println("Map: " + map); // Mango is removed from the map

        // Adding a key to the map directly
        map.put("Grapes", 5);
        System.out.println("\nAfter adding 'Grapes' to the map:");

        // Printing the keySet after adding a new key to the map
        System.out.println("keySet: " + keySet); // Grapes will appear in the keySet
    }

    //   OUTPUT

//    Keys in the map:
//    Banana
//            Apple
//    Mango
//            Orange
//
//    After removing 'Mango' from the keySet:
//    Map: {Banana=1, Apple=2, Orange=4}
//
//    After adding 'Grapes' to the map:
//    keySet: [Banana, Apple, Orange, Grapes]

}