package Stacks;

import java.util.Stack;

import javax.sql.rowset.spi.SyncResolver;

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

    // ----------Stock Span-----------
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    // ---------- Valid Parantheis-----------
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') // ()
                        || (s.peek() == '{' && ch == '}') // {}
                        || (s.peek() == '[' && ch == ']')) { // []
                    s.pop();
                } else {
                    return false; // invalid str
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);
        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }

        // String str = "ayan";
        // String result = reverseString(str);
        // System.out.println(result);

        // // 3, 2, 1
        // reverseStack(s);
        // printStack(s);
        // // 1, 2, 3

        // Stock Span
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }

        // ------------Next Greater Element- O(n)----------
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // while - empty or remove smaller elm
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // if -else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // push in s
            s.push(i);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();

        // -- Valid Parenthesis--
        String str = "({})[]"; // true
        System.out.println(isValid(str));
    }
}
