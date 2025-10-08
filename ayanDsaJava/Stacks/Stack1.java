package Stacks;

import java.util.Stack;

public class Stack1 {

    // ----push at the Bottom of Stack----
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data); // Add data if empty
            return;
        }
        int top = s.pop(); // (pop - the upper element)
        pushAtBottom(s, data);
        s.push(top); // push after empting the stack [4, 1..]
    }

    // -----Reverse a string using Stack----
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) { // adding to the stack
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder(""); // reverse-we add to the SB
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr); // add to the builder
        }

        return result.toString();
    }

    // --------Reverse a Stack-------
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        String str = "ayan";
        String result = reverseString(str);
        System.out.println(result);

        // 3, 2, 1
        reverseStack(s);
        printStack(s);
        // 1, 2, 3
    }
}
