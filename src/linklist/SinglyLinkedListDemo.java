package src.linklist;

public class SinglyLinkedListDemo {
        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();

            list.addFirst(10);
            list.addFirst(20);
            list.addLast(30);
            list.printList();  // Output: 20 10 30

            list.removeFirst();
            list.printList();  // Output: 10 30

            list.removeLast();
            list.printList();  // Output: 10

            System.out.println(list.find(10));  // Output: true
            System.out.println(list.find(40));  // Output: false
        }
    }