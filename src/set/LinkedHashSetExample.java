package src.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

//    Characteristics:
//    Order: Maintains the insertion order of elements.
//    Performance: O(1) average time complexity for add, remove, and contains operations.
//    Null Handling: Allows one null element.


//    Important Methods:
//    add(E e): Adds the specified element to the set if it's not already present.
//    remove(Object o): Removes the specified element from the set if it's present.
//    contains(Object o): Returns true if the set contains the specified element.
//    size(): Returns the number of elements in the set.
//    isEmpty(): Returns true if the set contains no elements.
//     clear(): Removes all the elements from the set.
//     iterator(): Returns an iterator over the elements in this set.





    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Orange");

        // Check if an element is present
        System.out.println("Contains Apple? " + linkedHashSet.contains("Apple")); // true

        // Iterate over elements
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // Clear the set
        linkedHashSet.clear();
        System.out.println("Is empty? " + linkedHashSet.isEmpty()); // true
    }
}