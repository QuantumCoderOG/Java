package src.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(1, "Blueberry"); // Inserts "Blueberry" at index 1
        System.out.println("Initial ArrayList: " + fruits);

        // Accessing elements in the ArrayList
        System.out.println("Element at index 2: " + fruits.get(2));

        // Updating elements in the ArrayList
        fruits.set(2, "Strawberry"); // Replaces element at index 2 with "Strawberry"
        System.out.println("Updated ArrayList: " + fruits);

        // Removing elements from the ArrayList
        fruits.remove(1); // Removes the element at index 1
        fruits.remove("Apple"); // Removes "Apple" from the ArrayList
        System.out.println("After removals: " + fruits);

        // Checking the size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Searching for elements in the ArrayList
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));
        System.out.println("Index of 'Strawberry': " + fruits.indexOf("Strawberry"));

        // Sorting the ArrayList
        Collections.sort(fruits); // Sorts the ArrayList in natural (alphabetical) order
        System.out.println("Sorted ArrayList: " + fruits);

        // Iterating over the ArrayList using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterating over the ArrayList using an iterator
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }

    //Not synchronized (thread-unsafe)
    //General-purpose collection, fast access by index
}