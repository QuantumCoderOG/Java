package src.queue;

import java.util.ArrayList;
import java.util.List;

public class QueueUsingArrayList {
    public static void main(String[] args) {
        // Create a queue using ArrayList
        List<Integer> queue = new ArrayList<>();

        // Enqueue (add elements to the end of the queue)
        enqueue(queue, 10);
        enqueue(queue, 20);
        enqueue(queue, 30);
        System.out.println("Queue after enqueues: " + queue); // Output: [10, 20, 30]

        // Dequeue (remove elements from the front of the queue)
        int dequeuedElement = dequeue(queue);
        System.out.println("Dequeued element: " + dequeuedElement); // Output: 10
        System.out.println("Queue after dequeue: " + queue); // Output: [20, 30]

        // Peek (look at the front element without removing it)
        int frontElement = peek(queue);
        System.out.println("Front element (peek): " + frontElement); // Output: 20

        // Check if the queue is empty
        boolean isEmpty = isEmpty(queue);
        System.out.println("Is queue empty? " + isEmpty); // Output: false

        // Display the final state of the queue
        System.out.println("Final Queue: " + queue); // Output: [20, 30]
    }

    // Enqueue method to add an element to the end of the queue
    public static void enqueue(List<Integer> queue, int value) {
        queue.add(value);
    }

    // Dequeue method to remove an element from the front of the queue
    public static int dequeue(List<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        return queue.remove(0); // Remove the element at the front (index 0)
    }

    // Peek method to look at the front element without removing it
    public static int peek(List<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;
        }
        return queue.get(0); // Get the element at the front (index 0)
    }

    // Method to check if the queue is empty
    public static boolean isEmpty(List<Integer> queue) {
        return queue.isEmpty();
    }
}