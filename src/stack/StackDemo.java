package src.stack;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Create a Stack of strings
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Initial Stack: " + stack);

        // Accessing the top element using peek()
        System.out.println("Top element: " + stack.peek()); // "Cherry"

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Removes "Cherry"
        System.out.println("Stack after pop: " + stack);

        // Searching for elements in the stack
        System.out.println("Position of 'Banana' (from top): " + stack.search("Banana")); // Returns 1 (top is 1-based)
        System.out.println("Position of 'Apple' (from top): " + stack.search("Apple")); // Returns 2

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Iterating over the stack
        System.out.println("Iterating over the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Popping elements one by one
        }

        // The stack should be empty now
        System.out.println("Is the stack empty after popping all elements? " + stack.isEmpty());
    }
}