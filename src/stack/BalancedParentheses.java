package src.stack;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String expression = "{[()]}";
        boolean isBalanced = checkBalanced(expression);
        System.out.println("Is the expression balanced? " + isBalanced);
    }

    public static boolean checkBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                char last = stack.pop();
                if (!isMatchingPair(last, ch)) {
                    return false; // Mismatched pair
                }
            }
        }

        return stack.isEmpty(); // Balanced if stack is empty at the end
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}