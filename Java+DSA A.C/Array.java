import java.util.*;

public class Array {
    // public static void main(String[] args) {
    // int marks[] = new int[50];
    // Scanner sc = new Scanner(System.in);

    // marks[0] = sc.nextInt();
    // marks[1] = sc.nextInt();
    // marks[2] = sc.nextInt();

    // int percentage = (marks[0]+ marks[1]+ marks[2])/3;
    // System.out.println("Percentage: "+ percentage);
    // System.out.println(marks.length); // To know the lenght of an Array (.length)

    // ------------------------------------Prog-2---------------------------------------
    // public static void update(int marks[]) {

    // for (int i = 0; i < marks.length; i++) {
    // marks[i] = marks[i] + 1;
    // }
    // }

    // public static void main(String[] args) {
    // int marks[] = { 99, 76, 58 };
    // update(marks);
    // // print marks
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    // // OR
    // // for (int i = 0; i < marks.length; i++) {
    // // System.out.println(marks[i] + " ");

    // Linear Search

    // public static int linearSearch(int number[], int key) {
    // for (int i = 0; i < number.length; i++) {
    // if (number[i] == key) {
    // return i;
    // }

    // }
    // return -1;
    // }

    // public static void main(String[] args) {
    // int number[] = { 34, 12, 25, 10, 57, 89 };
    // int key = 10;
    // int index = linearSearch(number, key);
    // if (index == -1) {
    // System.out.println("Key not found");
    // } else {
    // System.out.println("The key is: " + key);
    // }
    // }

    // Larest No in Array
    // public static int getLargest(int numbers[]) {
    //     int largest = Integer.MIN_VALUE;
    //     for (int i = 0; i < numbers.length; i++) {

    //         if (largest < numbers[i]) {
    //             largest = numbers[i];
    //         }
    //     }
    //     return largest;
    // }

    // public static void main(String[] args) {
    //     int numbers[] = { 3, 5, 7, 10, 32, 15 };
    //     System.out.println("The larest No: " + getLargest(numbers));


    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1; 

        while(start <= end){
            int mid = (start+end)/2;  

            if (numbers[mid] == key){       //found
                return mid;
            }
            
            if (numbers[mid] < key){       //right
                start = mid + 1;
            }else{                        //left
                end = mid - 1;            
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]= {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        System.out.println( "The index is: " + binarySearch(numbers, key));
    }
    }
