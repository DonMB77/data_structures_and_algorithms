package datastructures.stacks;

import java.util.ArrayList;

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

    public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
    }
}
