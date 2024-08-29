package src.list;
import java.util.Vector;
import java.util.List;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> fruits = new Vector<>();

        // Adding elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1, "Cherry"); // Adds "Cherry" at index 1
        fruits.addElement("Grapes"); // Adds "Grapes" at the end
        System.out.println("Initial Vector: " + fruits);

        // Accessing elements in the Vector
        System.out.println("First element: " + fruits.firstElement());
        System.out.println("Last element: " + fruits.lastElement());
        System.out.println("Element at index 2: " + fruits.get(2));

        // Updating elements in the Vector
        fruits.set(2, "Blueberry"); // Replaces element at index 2
        System.out.println("Updated Vector: " + fruits);

        // Removing elements from the Vector
        fruits.remove(0); // Removes the element at index 0
        fruits.removeElement("Banana"); // Removes the first occurrence of "Banana"
        System.out.println("After removals: " + fruits);

        // Checking size and if the Vector is empty
        System.out.println("Size of Vector: " + fruits.size());
        System.out.println("Is Vector empty? " + fruits.isEmpty());

        // Searching for elements
        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Index of 'Cherry': " + fruits.indexOf("Cherry"));

        // Iterating over the Vector
        System.out.println("Iterating over Vector:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sublist of Vector
        List<String> subList = fruits.subList(0, 1);
        System.out.println("Sublist of Vector: " + subList);

        // Clearing the Vector
        fruits.clear();
        System.out.println("Vector after clearing: " + fruits);
    }
//Synchronized (thread-safe)
    //Thread-safe operations required, legacy class
}