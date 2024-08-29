package src.queue;

import java.util.ArrayList;

public class BasicQueueOperations {
    public static void main(String[] args) {
        // Create a queue using ArrayList
        ArrayList<Integer> queue = new ArrayList<>();

        // Enqueue operation (adding elements to the queue)
        enqueue(queue, 10);
        enqueue(queue, 20);
        enqueue(queue, 30);
        System.out.println("Queue after enqueues: " + queue);  // Output: [10, 20, 30]

        // Peek operation (getting the front element without removing it)
        int frontElement = peek(queue);
        System.out.println("Front element (peek): " + frontElement);  // Output: 10

        // Dequeue operation (removing the front element)
        int dequeuedElement = dequeue(queue);
        System.out.println("Dequeued element: " + dequeuedElement);  // Output: 10
        System.out.println("Queue after dequeue: " + queue);  // Output: [20, 30]

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);  // Output: false
    }

    // Enqueue method to add an element to the end of the queue
    public static void enqueue(ArrayList<Integer> queue, int value) {
        queue.add(value);
    }

    // Dequeue method to remove an element from the front of the queue
    public static int dequeue(ArrayList<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        return queue.remove(0);  // Remove and return the front element
    }

    // Peek method to get the front element without removing it
    public static int peek(ArrayList<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;
        }
        return queue.get(0);  // Return the front element
    }
}