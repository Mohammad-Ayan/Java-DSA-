package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // ---addFirst in Ll---
    public void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - newNode next = head
        newNode.next = head;

        // step 3 - head = newNode
        head = newNode;
    }

    // ---addLast in Ll---
    public void addLast(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - tail.next = newNode
        tail.next = newNode;

        // step 3 - tail = newNode
        tail = newNode;
    }

    // ---Print the Ll---
    public void print() { // O(n)
        if (head == null) {
            // System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
    }
}
