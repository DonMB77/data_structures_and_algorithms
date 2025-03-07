package datastructures.stacks;

import datastructures.stacks.MyQueue;
import datastructures.stacks.StackAsArrayList;

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

    public static StackAsArrayList<Integer> sortStack(StackAsArrayList<Integer> inputStack) {
        StackAsArrayList<Integer> additionalStack = new StackAsArrayList<>();
        while (!inputStack.isEmpty()) {
            int temp = inputStack.pop();
            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                inputStack.push(additionalStack.pop());
            }
            additionalStack.push(temp);
        }
        while (!additionalStack.isEmpty()) {
            inputStack.push(additionalStack.pop());
        }
        return inputStack;
    }

    public static void main(String[] args) {
        // Create a new queue
        MyQueue q = new MyQueue();

        // Enqueue some values
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        // Output the front of the queue
        System.out.println("Front of the queue: " + q.peek());

        // Dequeue some values
        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());

        // Enqueue another value
        q.enqueue(4);

        // Output the front of the queue again
        System.out.println("Front of the queue: " + q.peek());

        // Dequeue all remaining values
        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + q.isEmpty());

        // Dequeue from an empty queue and check if it returns null
        System.out.println("Dequeued value from empty queue: " + q.dequeue());
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