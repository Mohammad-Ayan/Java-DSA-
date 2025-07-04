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
    public static int size;

    // -----addFirst in Ll-----
    public void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - newNode next = head
        newNode.next = head;

        // step 3 - head = newNode
        head = newNode;
    }

    // -----addLast in Ll-----
    public void addLast(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - tail.next = newNode
        tail.next = newNode;

        // step 3 - tail = newNode
        tail = newNode;
    }

    // -----Print the Ll-----
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

    // -----add at idx of Ll-----
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
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

    // -----Remove First in Ll-----
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linkedlist is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data; // value which we are deleting
        head = head.next;
        size--;
        return val; // return the remove value
    }

    // -----Remove First in Ll-----
    public int removeLast() {
        if (size == 0) {
            System.out.println("linedlist is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev: i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data
        prev.next = null; // disconnect the last node
        tail = prev; // update tail to new last node
        size--;
        return val;
    }

    // -----Search in a Ll (Iterative)-----
    public int itrSearch (int key) {  // O(n)
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();

        // System.out.println(ll.size);
        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println(ll.itrSearch(4));
    }
}
