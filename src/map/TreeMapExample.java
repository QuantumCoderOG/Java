package src.map;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
//    Characteristics:
//    Order: Maintains a sorted order of the entries by their keys, either natural ordering or by a specified comparator.
//            Performance: O(log n) time complexity for put, get, and remove operations.
//    Null Handling: Does not allow null keys.


//    Important Methods:
//    put(K key, V value): Associates the specified value with the specified key in this map.
//            get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
//    remove(Object key): Removes the mapping for the specified key from this map if present.
//            firstKey(): Returns the first (lowest) key currently in this map.
//            lastKey(): Returns the last (highest) key currently in this map.
//            size(): Returns the number of key-value mappings in this map.
//            isEmpty(): Returns true if this map contains no key-value mappings.
//    clear(): Removes all of the mappings from this map.
//            keySet(): Returns a Set view of the keys contained in this map.
//            values(): Returns a Collection view of the values contained in this map.
//            entrySet(): Returns a Set view of the mappings contained in this map.
//            subMap(K fromKey, K toKey): Returns a view of the portion of this map whose keys range from fromKey to toKey.


    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 1);
        treeMap.put("Apple", 2);
        treeMap.put("Mango", 3);
        treeMap.put("Orange", 4);

        // Get the value associated with a key
        System.out.println("Value for Apple: " + treeMap.get("Apple")); // 2

        // Check if a key exists
        System.out.println("Contains Mango? " + treeMap.containsKey("Mango")); // true

        // Get the first and last keys
        System.out.println("First key: " + treeMap.firstKey()); // Apple
        System.out.println("Last key: " + treeMap.lastKey()); // Orange

        // Iterate over entries
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clear the map
        treeMap.clear();
        System.out.println("Is empty? " + treeMap.isEmpty()); // true
    }
}