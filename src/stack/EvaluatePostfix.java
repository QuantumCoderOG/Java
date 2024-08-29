package src.stack;
import java.util.Stack;

public class EvaluatePostfix {
    public static void main(String[] args) {
        String postfix = "53+82-*";
        int result = evaluatePostfix(postfix);
        System.out.println("Result of the postfix expression: " + result);
    }

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Push the digit onto the stack
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
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

        return stack.pop(); // The final result is the last element on the stack
    }
}