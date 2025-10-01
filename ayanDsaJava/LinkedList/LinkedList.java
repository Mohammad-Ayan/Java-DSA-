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

        // step 3 - Create newNode as head
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

    // -----Remove Last in Ll-----
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
        Node prev = head; // initiallize
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next; // itterate
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
        if (n == sz) {
            head = head.next; // if remove first
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

    }

    // --------Check Ll is Palindrome-------
    // ---Slow Fast---
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is midNode
    }

    public boolean checkPalindrome() {
        if (head == null && head.next == null) {
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head; // left half head

        // step3 - check left and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // --------Detect a Loop/Cycle in a LL-------
    public static boolean isCycle() { // Floyd's CFA
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (fast == slow) {
                return true; // cycle exist
            }
        }
        return false; // cycle not exist (linear LL)
    }

    // --------Remove a Loop/Cycle in a LL-------
    // detect cycle
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast; // keep track of prev node
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle -> last.next = null
        prev.next = null;
    }

    // --------Merge Sort on a LL------- TC: O(nlogn)
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next; // on 2 node

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid Node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    // --------Zig Zag LL----------
    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // resverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next; // store next
            curr.next = prev; // reverse link
            prev = curr; // move prev
            curr = next; // move curr
        }

        Node left = head; // 1st half head
        Node right = prev; // head of reversed 2nd half
        Node nextL, nextR;

        // alternative merge - zigzag
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    // ----------Doubly LL----------
    public class DoubleLL {
        public static class Node {
            int data;
            Node next;
            Node prev;

            public Node(int data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;
        public static int size;

        // ---add - addFirst
        public void addfirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        // print
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.print("null");
        }

        // ---remove - removeFirst
        public int removeFirst() {
            if(head == null){
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE; // -1
            }

            if (size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }

            int val = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return val;
        }

        // -------Reverse a DLL-------
        public void reverse(){
            Node curr = head;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;

                prev = curr;
                curr = next;
            }
            head = prev;
        }

    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        // ll.add(2, 3);
        // ll.print();

        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.itrSearch(4));
        // System.out.println(ll.recSearch(3));

        // ll.reverse(); // 5->4->3->2-1
        // ll.print();
        // ll.deleteNthfromEnd(3);
        // ll.print();

        // for palindrome
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(1);

        // ll.print();
        // System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = temp;
        // 1->2->3->4->2
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        // --------Add Remove LL Using JCF-------
        // LinkedList<Integer> ll = new LinkedList<>();

        // Merge Sort
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // // 5-> 4-> 3-> 2-> 1

        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        // // Zig Zag
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // // 1-> 2-> 3-> 4-> 5

        // ll.print();
        // ll.zigZag();
        // ll.print();

        DoubleLL dll = ll.new DoubleLL();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);

        dll.print(); // Output: 1<->2<->3<->null
        System.out.println(" "+ "(Size: "+ dll.size +")");

        // dll.removeFirst();
        // dll.print();
        // System.out.println(" "+ "(Size: "+ dll.size +")");

        dll.reverse();
        dll.print();
    }
}