package src.queue;
import java.util.Deque;
import java.util.LinkedList;


public class deque {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Adding elements to the deque
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(0);
        deque.offerLast(3);

        System.out.println("Deque after additions: " + deque);

        // Removing elements from the deque
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removals: " + deque);

        // Peeking at elements
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());
    }

//    A Deque (pronounced "deck") stands for "double-ended queue," which is a data structure that allows insertion and deletion of elements from both ends. Here are some key features and operations of a Deque:
//
//    Key Features:
//    Dynamic Size: The size of the Deque is dynamic and can grow or shrink as needed.
//    Double-Ended: Elements can be added or removed from both the front and the back, providing more flexibility than a standard queue or stack.
//    Bidirectional Access: Allows operations at both ends of the data structure.
//            Operations:
//    Insertion Operations:
//
//    addFirst(E e): Inserts the specified element at the front of the deque.
//    addLast(E e): Inserts the specified element at the end of the deque.
//    offerFirst(E e): Inserts the specified element at the front of the deque, returning true upon success and false if no space is available.
//    offerLast(E e): Inserts the specified element at the end of the deque, returning true upon success and false if no space is available.
//    Removal Operations:
//
//    removeFirst(): Removes and returns the first element from the deque.
//            removeLast(): Removes and returns the last element from the deque.
//            pollFirst(): Removes and returns the first element from the deque, or returns null if the deque is empty.
//    pollLast(): Removes and returns the last element from the deque, or returns null if the deque is empty.
//    Peek Operations:
//
//    getFirst(): Retrieves, but does not remove, the first element of the deque.
//            getLast(): Retrieves, but does not remove, the last element of the deque.
//            peekFirst(): Retrieves, but does not remove, the first element of the deque, or returns null if the deque is empty.
//    peekLast(): Retrieves, but does not remove, the last element of the deque, or returns null if the deque is empty.
//    Deque as Stack:
//
//    push(E e): Adds an element at the front of the deque (like pushing onto a stack).
//    pop(): Removes and returns the first element from the deque (like popping from a stack).
}
