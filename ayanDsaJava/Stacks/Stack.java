package Stacks;

import java.util.*;

public class Stack {
    // --------------Stack using ArrayList---------------

    static class stackArraylist {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data); // top of list
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1); // O(1) [top = last element of list]
            list.remove(list.size() - 1); // O(1)
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) { // if stack is empty
                return -1;
            }
            return list.get(list.size() - 1); // O(1) [top = last element of list]
        }
    }

    // ----------Stack Using Linked List------------
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    static class StackLinkedList {
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        // push 
        public static void push(int data){
            Node newNode = new Node(data);

            if(isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop() {
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;  // removed node
        }

        //peek
        public static int peek() {
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        // Stack.stackArraylist s = new Stack.stackArraylist(); // ✅ inner class
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);

        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        Stack.StackLinkedList s = new Stack.StackLinkedList(); // ✅ inner class
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
