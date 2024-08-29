package src.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1, "Cherry"); // Adds "Cherry" at index 1
        fruits.addFirst("Orange"); // Adds "Orange" at the beginning
        fruits.addLast("Grapes"); // Adds "Grapes" at the end
        System.out.println("Initial LinkedList: " + fruits);

        // Accessing elements in the LinkedList
        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Last element: " + fruits.getLast());
        System.out.println("Element at index 2: " + fruits.get(2));

        // Updating elements in the LinkedList
        fruits.set(2, "Blueberry"); // Replaces element at index 2
        System.out.println("Updated LinkedList: " + fruits);

        // Removing elements from the LinkedList
        fruits.removeFirst(); // Removes the first element
        fruits.removeLast(); // Removes the last element
        fruits.remove(1); // Removes the element at index 1
        System.out.println("After removals: " + fruits);

        // Checking size and if the LinkedList is empty
        System.out.println("Size of LinkedList: " + fruits.size());
        System.out.println("Is LinkedList empty? " + fruits.isEmpty());

        // Searching for elements
        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Index of 'Banana': " + fruits.indexOf("Banana"));

        // Iterating over the LinkedList
        System.out.println("Iterating over LinkedList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sublist of LinkedList
        List<String> subList = fruits.subList(0, 1);
        System.out.println("Sublist of LinkedList: " + subList);

        // Clearing the LinkedList
        fruits.clear();
        System.out.println("LinkedList after clearing: " + fruits);
    }


}