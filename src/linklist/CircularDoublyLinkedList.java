package src.linklist;

class CircularDoublyLinkedList {
    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    // Print the list from head to tail
    public void printList() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Print the list from tail to head
    public void printListReverse() {
        if (tail == null) return;
        Node current = tail;
        do {
            System.out.print(current.data + " ");
            current = current.prev;
        } while (current != tail);
        System.out.println();
    }

    // Remove the first node
    public void removeFirst() {
        if (head == null) return;
        if (head == tail) { // Only one node
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.printList(); // Output: 10 20 30
        list.printListReverse(); // Output: 30 20 10

        list.removeFirst();
        list.printList(); // Output: 20 30
    }
}