package src.list;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        // Create a CopyOnWriteArrayList of strings
        List<String> fruits = new CopyOnWriteArrayList<>();

        // Adding elements to the CopyOnWriteArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Initial List: " + fruits);

        // Iterating over the CopyOnWriteArrayList using a for-each loop
        System.out.println("Iterating over the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Attempt to modify the list during iteration
        for (String fruit : fruits) {
            if ("Banana".equals(fruit)) {
                fruits.remove(fruit);  // This operation is safe and will not throw ConcurrentModificationException
            }
        }

        System.out.println("List after removal: " + fruits);

        // Adding a new element to the list
        fruits.add("Date");
        System.out.println("List after adding 'Date': " + fruits);

        // Getting a snapshot of the list (no synchronization needed)
        List<String> snapshot = new CopyOnWriteArrayList<>(fruits);
        System.out.println("Snapshot of the list: " + snapshot);
    }

//    When to Use CopyOnWriteArrayList:
//    High Read-to-Write Ratio: When you expect many more read operations than write operations.
//    Concurrent Iteration: When you need to iterate over a list safely in a concurrent environment without dealing with locks.
//            Immutability for Readers: Readers accessing the list should see a consistent view without worrying about ongoing modifications.
//    Limitations:
//    Inefficient Writes: Due to the array copy on every write, CopyOnWriteArrayList is inefficient for scenarios with frequent modifications.
//    Memory Overhead: The memory overhead can be significant due to the creation of new arrays for every modification.
}