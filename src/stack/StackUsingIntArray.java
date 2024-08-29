package src.stack;

public class StackUsingIntArray {
    public static void main(String[] args) {
        // Define the maximum size of the stack
        int maxSize = 5;
        int[] stack = new int[maxSize];
        int top = -1; // The stack is initially empty

        // Push elements onto the stack
        top = push(stack, top, maxSize, 10);
        top = push(stack, top, maxSize, 20);
        top = push(stack, top, maxSize, 30);
        System.out.println("Stack after pushes: ");
        display(stack, top);

        // Peek the top element (without removing it)
        int topElement = peek(stack, top);
        System.out.println("Top element (peek): " + topElement);

        // Pop the top element from the stack
        top = pop(stack, top);
        System.out.println("Stack after pop: ");
        display(stack, top);

        // Check if the stack is empty
        boolean isEmpty = (top == -1);
        System.out.println("Is stack empty? " + isEmpty);

        // Check the size of the stack
        int size = top + 1;
        System.out.println("Stack size: " + size);

        // Display the final stack
        System.out.println("Final Stack: ");
        display(stack, top);
    }

    // Method to push an element onto the stack
    public static int push(int[] stack, int top, int maxSize, int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
        }
        return top;
    }

    // Method to pop the top element from the stack
    public static int pop(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack underflow! Cannot pop element.");
        } else {
            System.out.println("Popped element: " + stack[top--]);
        }
        return top;
    }

    // Method to peek the top element of the stack
    public static int peek(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack is empty! Cannot peek.");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Method to display the elements of the stack
    public static void display(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}