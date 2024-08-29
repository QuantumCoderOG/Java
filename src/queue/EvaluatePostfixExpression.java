package src.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EvaluatePostfixExpression {
    public static void main(String[] args) {
        String postfixExpression = "53+82-*";  // Equivalent to (5 + 3) * (8 - 2)
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Result of the postfix expression: " + result);  // Output: 48
    }

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Enqueue all characters of the postfix expression into the queue
        for (char ch : expression.toCharArray()) {
            queue.add(ch);
        }

        // Process the queue until it's empty
        while (!queue.isEmpty()) {
            char ch = queue.poll();

            // If the character is a digit, push it onto the stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                // If the character is an operator, pop two operands from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                // Perform the operation and push the result back onto the stack
                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        // The final result is the only remaining element on the stack
        return stack.pop();
    }
}