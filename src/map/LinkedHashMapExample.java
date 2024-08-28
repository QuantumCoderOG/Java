package src.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
//
//    Characteristics:
//    Order: Maintains the insertion order of the entries.
//            Performance: O(1) average time complexity for put, get, and remove operations.
//    Null Handling: Allows one null key and multiple null values.

//    Important Methods:
//    put(K key, V value): Associates the specified value with the specified key in this map.
//            get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
//    remove(Object key): Removes the mapping for the specified key from this map if present.
//            size(): Returns the number of key-value mappings in this map.
//            isEmpty(): Returns true if this map contains no key-value mappings.
//    clear(): Removes all of the mappings from this map.
//            keySet(): Returns a Set view of the keys contained in this map.
//            values(): Returns a Collection view of the values contained in this map.
//            entrySet(): Returns a Set view of the mappings contained in this map.
//            containsKey(Object key): Returns true if this map contains a mapping for the specified key.
//            containsValue(Object value): Returns true if this map maps one or more keys to the specified value.


    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Banana", 1);
        linkedHashMap.put("Apple", 2);
        linkedHashMap.put("Mango", 3);
        linkedHashMap.put("Orange", 4);

        // Get the value associated with a key
        System.out.println("Value for Apple: " + linkedHashMap.get("Apple")); // 2

        // Check if a key exists
        System.out.println("Contains Mango? " + linkedHashMap.containsKey("Mango")); // true

        // Iterate over entries
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clear the map
        linkedHashMap.clear();
        System.out.println("Is empty? " + linkedHashMap.isEmpty()); // true
    }
}