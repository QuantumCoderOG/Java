package src.queue;

public class CircularQueueUsingArray {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the circular queue
    public CircularQueueUsingArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation (adding elements to the queue)
    public boolean enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full! Cannot enqueue " + value);
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    // Dequeue operation (removing elements from the queue)
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    // Peek operation (getting the front element without removing it)
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display the elements of the circular queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
        } else {
            int index = front;
            for (int i = 0; i < size; i++) {
                System.out.print(queue[index] + " ");
                index = (index + 1) % capacity;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueueUsingArray circularQueue = new CircularQueueUsingArray(5);

        // Enqueue elements
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.display();  // Output: 10 20 30 40

        // Dequeue elements
        System.out.println("Dequeued element: " + circularQueue.dequeue());  // Output: 10
        circularQueue.display();  // Output: 20 30 40

        // Enqueue more elements
        circularQueue.enqueue(50);
        circularQueue.enqueue(60);
        circularQueue.display();  // Output: 20 30 40 50 60

        // Try to enqueue when the queue is full
        circularQueue.enqueue(70);  // Output: Queue is full! Cannot enqueue 70

        // Peek the front element
        System.out.println("Front element (peek): " + circularQueue.peek());  // Output: 20
    }
}