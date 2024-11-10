package Stack;

import java.util.Stack;

public class RemovingStarsFromAString {
	public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        // Process each character in the string
        for (char c : s.toCharArray()) {
            if (c == '*') {
                // If current character is '*', remove the closest character to the left
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Otherwise, push the character to the stack
                stack.push(c);
            }
        }

        // Build the resulting string from the characters left in the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
    	RemovingStarsFromAString solution = new RemovingStarsFromAString();

        // Example 1
        String s1 = "leet**cod*e";
        System.out.println("Example 1:");
        System.out.println("Input: s = \"leet**cod*e\"");
        System.out.println("Expected Output: \"lecoe\"");
        System.out.println("Actual Output: " + solution.removeStars(s1));
        System.out.println();

        // Example 2
        String s2 = "erase*****";
        System.out.println("Example 2:");
        System.out.println("Input: s = \"erase*****\"");
        System.out.println("Expected Output: \"\"");
        System.out.println("Actual Output: " + solution.removeStars(s2));
    }
}
