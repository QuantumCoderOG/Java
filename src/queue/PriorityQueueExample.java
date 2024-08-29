package src.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue of integers
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Enqueue operation (adding elements to the priority queue)
        priorityQueue.offer(15);
        priorityQueue.offer(5);
        priorityQueue.offer(20);
        priorityQueue.offer(10);
        System.out.println("Priority Queue after enqueues: " + priorityQueue);  // Output: [5, 10, 20, 15]

        // Peek operation (getting the element with the highest priority without removing it)
        int topPriorityElement = priorityQueue.peek();
        System.out.println("Top priority element (peek): " + topPriorityElement);  // Output: 5

        // Dequeue operation (removing the element with the highest priority)
        int dequeuedElement = priorityQueue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);  // Output: 5
        System.out.println("Priority Queue after dequeue: " + priorityQueue);  // Output: [10, 15, 20]

        // Check if the priority queue is empty
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("Is priority queue empty? " + isEmpty);  // Output: false

        // Display the remaining elements in the priority queue
        System.out.println("Remaining Priority Queue: " + priorityQueue);  // Output: [10, 15, 20]
    }
}