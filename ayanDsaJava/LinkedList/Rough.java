package LinkedList;

public class Rough {
 public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
} 
public static  Node head;
public static void main(String[] args) {
Rough ll= new Rough();
ll.head=new Node(3);
}
}

public static void main(String[] args) {
    int marks[] = { 99, 76, 58 };
    update(marks);
    // print marks
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
   // OR
    for (int i = 0; i < marks.length; i++) {
        if(marks[i] == 76){
        System.out.println(marks[i] + " ");
        }
    }}

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