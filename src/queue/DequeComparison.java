package src.queue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeComparison {
    public static void main(String[] args) {
        // Using ArrayDeque
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(1);
        arrayDeque.addLast(2);
        arrayDeque.addFirst(0);
        System.out.println("ArrayDeque: " + arrayDeque);

        // Using LinkedList
        Deque<Integer> linkedListDeque = new LinkedList<>();
        linkedListDeque.addLast(1);
        linkedListDeque.addLast(2);
        linkedListDeque.addFirst(0);
        System.out.println("LinkedListDeque: " + linkedListDeque);
    }

//    Palindromes Check: Since you can access elements from both ends, Deques are useful for checking if a string is a palindrome.
//    Sliding Window Problems: Deques are often used in algorithms that require keeping track of a sliding window of elements, such as finding the maximum or minimum in a sliding window of a certain size.
//    Deque is a versatile and powerful data structure that is particularly useful when you need to perform operations on both ends of a collection of elements efficiently.
}
