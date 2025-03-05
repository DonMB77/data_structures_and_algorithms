package datastructures.stacks;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {

    public static String reverseString (String stringToBeReversed) {
        StackAsArrayList<Character> stack = new StackAsArrayList<>();
        String reverseString = "";
        for (char c : stringToBeReversed.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }

        return reverseString;
    }

    public static boolean isBalancedParentheses(String parentheses) {
        StackAsArrayList<Character> stack = new StackAsArrayList<>();
        for (char p : parentheses.toCharArray()) {
            if (p == '(') {
                stack.push(p);
            } else if (p == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }

    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }

}
