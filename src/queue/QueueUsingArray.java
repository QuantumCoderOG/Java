package src.queue;

public class QueueUsingArray {
    public static void main(String[] args) {
        int maxSize = 5;
        int[] queue = new int[maxSize];
        int front = 0;
        int rear = -1;
        int size = 0;

        // Enqueue (add elements to the end of the queue)
        rear = enqueue(queue, rear, maxSize, size++, 10);
        rear = enqueue(queue, rear, maxSize, size++, 20);
        rear = enqueue(queue, rear, maxSize, size++, 30);
        System.out.println("Queue after enqueues:");
        display(queue, front, rear, size);

        // Dequeue (remove elements from the front of the queue)
        front = dequeue(queue, front, size--);
        System.out.println("Queue after dequeue:");
        display(queue, front, rear, size);

        // Peek (look at the front element without removing it)
        int frontElement = peek(queue, front);
        System.out.println("Front element (peek): " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = (size == 0);
        System.out.println("Is queue empty? " + isEmpty);

        // Display the final state of the queue
        System.out.println("Final Queue:");
        display(queue, front, rear, size);
    }

    // Enqueue method to add an element to the queue
    public static int enqueue(int[] queue, int rear, int maxSize, int size, int value) {
        if (size == maxSize) {
            System.out.println("Queue is full! Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;
            queue[rear] = value;
        }
        return rear;
    }

    // Dequeue method to remove an element from the queue
    public static int dequeue(int[] queue, int front, int size) {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue.");
        } else {
            System.out.println("Dequeued element: " + queue[front]);
            front = (front + 1) % queue.length;
        }
        return front;
    }

    // Peek method to look at the front element without removing it
    public static int peek(int[] queue, int front) {
        if (queue.length == 0) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;
        }
        return queue[front];
    }

    // Method to display the elements of the queue
    public static void display(int[] queue, int front, int rear, int size) {
        if (size == 0) {
            System.out.println("Queue is empty!");
        } else {
            int index = front;
            for (int i = 0; i < size; i++) {
                System.out.print(queue[index] + " ");
                index = (index + 1) % queue.length;
            }
            System.out.println();
        }
    }
}