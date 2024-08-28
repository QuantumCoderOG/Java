package src.set;

import java.util.TreeSet;

//        Characteristics:
//        Order: Maintains elements in a sorted order, either natural ordering or by a specified comparator.
//        Performance: O(log n) time complexity for add, remove, and contains operations.
//        Null Handling: Does not allow null elements.

//        Important Methods:
//        add(E e): Adds the specified element to the set if it's not already present.
//        remove(Object o): Removes the specified element from the set if it's present.
//        contains(Object o): Returns true if the set contains the specified element.
//        first(): Returns the first (lowest) element in the set.
//        last(): Returns the last (highest) element in the set.
//        size(): Returns the number of elements in the set.
//        isEmpty(): Returns true if the set contains no elements.
//        clear(): Removes all the elements from the set.
//        iterator(): Returns an iterator over the elements in this set.
//        subSet(E fromElement, E toElement): Returns a portion of the set ranging from fromElement to toElement.



public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Orange");

        // Check if an element is present
        System.out.println("Contains Apple? " + treeSet.contains("Apple")); // true

        // Get the first and last elements
        System.out.println("First: " + treeSet.first()); // Apple
        System.out.println("Last: " + treeSet.last()); // Orange

        // Iterate over elements
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Clear the set
        treeSet.clear();
        System.out.println("Is empty? " + treeSet.isEmpty()); // true
    }
}