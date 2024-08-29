package src.queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        // Enqueue operation (adding elements to the queue)
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
        System.out.println("Queue after enqueues: " + queue);  // Output: [Alice, Bob, Charlie]

        // Peek operation (getting the front element without removing it)
        String frontElement = queue.peek();
        System.out.println("Front element (peek): " + frontElement);  // Output: Alice

        // Dequeue operation (removing the front element)
        String dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);  // Output: Alice
        System.out.println("Queue after dequeue: " + queue);  // Output: [Bob, Charlie]

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);  // Output: false

        // Display the remaining elements in the queue
        System.out.println("Remaining Queue: " + queue);  // Output: [Bob, Charlie]
    }
}