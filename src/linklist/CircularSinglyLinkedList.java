package src.linklist;

class CircularSinglyLinkedList {
    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point tail to head
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain the circular nature
        }
    }

    // Print the list
    public void printList() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Remove a node from the start of the list
    public void removeFirst() {
        if (head == null) return;
        if (head == tail) { // Only one node
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.printList(); // Output: 10 20 30

        list.removeFirst();
        list.printList(); // Output: 20 30
    }
}