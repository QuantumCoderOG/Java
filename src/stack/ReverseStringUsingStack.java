package src.stack;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string onto the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        // Pop characters from the stack to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Output the reversed string
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed.toString());
    }
}