package src.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {

//    The entrySet() method returns a Set view of the mappings (key-value pairs) contained in the map.
//    Each element in the Set is a Map.Entry object, which contains both the key and the value.
//
//    Important Methods of Map.Entry:
//    getKey(): Returns the key corresponding to this entry.
//     getValue(): Returns the value corresponding to this entry.
//    setValue(V value): Replaces the value corresponding to this entry with the specified value.
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 1);
        map.put("Apple", 2);
        map.put("Mango", 3);
        map.put("Orange", 4);

        // Get the entrySet from the map
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Iterate over the entries using the entrySet
        System.out.println("Entries in the map:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Modify an entry
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getKey().equals("Apple")) {
                entry.setValue(10); // Change the value associated with "Apple" to 10
            }
        }

        System.out.println("\nMap after modification:");
        System.out.println(map); // Apple=10
    }

//    OUTPUT
//    Entries in the map:
//    Key: Banana, Value: 1
//    Key: Apple, Value: 2
//    Key: Mango, Value: 3
//    Key: Orange, Value: 4
//
//    Map after modification:
//    {Banana=1, Apple=10, Mango=3, Orange=4}


}