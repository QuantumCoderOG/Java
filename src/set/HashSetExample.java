package src.set;

import java.util.HashSet;

public class HashSetExample {
//    Characteristics:
//    Order: No guaranteed order; elements are stored based on their hash code.
//    Performance: O(1) average time complexity for add, remove, and contains operations.
//    Null Handling: Allows one null element.

//    Important Methods:
//    add(E e): Adds the specified element to the set if it's not already present.
//    remove(Object o): Removes the specified element from the set if it's present.
//    contains(Object o): Returns true if the set contains the specified element.
//    size(): Returns the number of elements in the set.
//    isEmpty(): Returns true if the set contains no elements.
//    clear(): Removes all the elements from the set.
//    iterator(): Returns an iterator over the elements in this set.
//

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Orange");

        // Check if an element is present
        System.out.println("Contains Apple? " + hashSet.contains("Apple")); // true

        // Remove an element
        hashSet.remove("Mango");

        // Iterate over elements
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Clear the set
        hashSet.clear();
        System.out.println("Is empty? " + hashSet.isEmpty()); // true
    }
}