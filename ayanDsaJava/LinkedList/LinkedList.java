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

        // step 3 -  Create newNode as head
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

    // -----add at (middle)idx of Ll-----
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
    public int itrSearch(int key) { // O(n)
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

    // -----Search in a Ll (Recursive)-----
    public int helper(Node head, int key) { // O(n) | [Actual recursive function]
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0; // Found the key at current node, return index 0
        }

        int idx = helper(head.next, key); // Recursive call on rest of list

        if (idx == -1) {
            return -1;
        }

        return idx + 1; // Add 1 to idx(because we are 1 node behind)
    }

    public int recSearch(int key) {
        return helper(head, key); // head is the start of the list
    }

    // -----Reverse a Ll-----
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // -----Delete Nth Node from End------
    public void deleteNthfromEnd(int n) {
        // calcualte size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next; // if remove first
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

    }

    // --------Check Ll is Palindrome-------
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next == null){
            slow = slow.next;  // +1
            fast = fast.next.next;  // +2
        }
        return slow; // slow is midNode
    }

    public boolean checkPalindrome(){
        if(head == null && head.next != null){
            return true;
        }
        //step1 - find mid 
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next; 

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;  // left half head 

        //step3 - check left and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        // ll.add(2, 3);
        ll.print();

        // System.out.println(ll.size);
        // ll.removeFirst();
        ll.print();

        // ll.removeLast();
        ll.print();

        System.out.println(ll.itrSearch(4));
        System.out.println(ll.recSearch(3));

        // ll.reverse(); // 5->4->3->2-1
        // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.print();

        // for palindrome
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
