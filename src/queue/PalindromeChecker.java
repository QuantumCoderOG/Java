package src.queue;


import java.util.Deque;
import java.util.LinkedList;

public class PalindromeChecker {
        public static boolean isPalindrome(String input) {
            // Convert the string to lowercase and remove all non-alphanumeric characters
            String cleanedInput = input.toLowerCase().replaceAll("[^a-z0-9]", "");

            // Initialize a Deque to hold the characters
            Deque<Character> deque = new LinkedList<>();

            // Add all characters of the cleaned input to the deque
            for (char ch : cleanedInput.toCharArray()) {
                deque.addLast(ch);
            }

            // Check the characters from both ends
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false; // If any character doesn't match, it's not a palindrome
                }
            }

            return true; // If all characters match, it's a palindrome
        }

        public static void main(String[] args) {
            String input1 = "A man, a plan, a canal, Panama";
            String input2 = "Hello, World!";

            System.out.println("\"" + input1 + "\" is a palindrome: " + isPalindrome(input1));
            System.out.println("\"" + input2 + "\" is a palindrome: " + isPalindrome(input2));
        }
}
