package src.stack;
import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList{
    public static void main(String[] args) {
        // Create an ArrayList to act as the stack
        List<Integer> stack = new ArrayList<>();

        // Push elements onto the stack
        stack.add(10);
        stack.add(20);
        stack.add(30);
        System.out.println("Stack after pushes: " + stack);  // Output: Stack: [10, 20, 30]

        // Peek the top element (without removing it)
        int topElement = stack.get(stack.size() - 1);
        System.out.println("Top element (peek): " + topElement);  // Output: Top element (peek): 30

        // Pop the top element from the stack
        int poppedElement = stack.remove(stack.size() - 1);
        System.out.println("Popped element: " + poppedElement);  // Output: Popped element: 30
        System.out.println("Stack after pop: " + stack);  // Output: Stack: [10, 20]

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);  // Output: Is stack empty? false

        // Check the size of the stack
        int size = stack.size();
        System.out.println("Stack size: " + size);  // Output: Stack size: 2

        // Display the elements of the stack
        System.out.println("Final Stack: " + stack);  // Output: Final Stack: [10, 20]
    }
}