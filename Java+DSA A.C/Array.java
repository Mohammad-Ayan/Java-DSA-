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
    // OR
    // for (int i = 0; i < marks.length; i++) {
    // System.out.println(marks[i] + " ");

    // ------------------------------LinearSearch---------------------------------------

    // public static int linearSearch(int number[], int key) {
    // for (int i = 0; i < number.length; i++) {
    // if (number[i] == key) {
    // return i;
    // }

    // }
    // return -1; // no not exist
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

    // ----------------Larest No in Array----------------
    // public static int getLargest(int numbers[]) {
    // int largest = Integer.MIN_VALUE; // -infinity
    // for (int i = 0; i < numbers.length; i++) {

    // if (largest < numbers[i]) {
    // largest = numbers[i];
    // }
    // }
    // return largest;
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 3, 5, 7, 10, 32, 15 };
    // System.out.println("The larest No: " + getLargest(numbers));

    // --------------------------------binarySearch------------------------------------------
    // public static int binarySearch(int numbers[], int key) {
    // int start = 0, end = numbers.length - 1;

    // while (start <= end) {
    // int mid = (start + end) / 2;

    // if (numbers[mid] == key) { // found
    // return mid;
    // }

    // if (numbers[mid] < key) { // right
    // start = mid + 1;
    // } else { // left
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    // int key = 10;

    // System.out.println("The index is: " + binarySearch(numbers, key));

    // }
    // -----------------------Reverse_Array------------------------

    // public static void reverse(int numbers[]) {
    // int first = 0, last = numbers.length - 1;

    // while (first < last) {
    // // swap
    // int temp = numbers[last];
    // numbers[last] = numbers[first];
    // numbers[first] = temp;

    // first++;
    // last--;
    // }
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 12, 14, 16, 18, 20 };

    // reverse(numbers);

    // // print
    // for (int i = 0; i < numbers.length; i++) {
    // System.out.print(numbers[i] + " ");
    // }
    // System.out.println();
    // }

    // ------------------------Pairs_in_Array------------------------

    // public static void printPairs(int numbers[]) {
    // int tp = 0; // total pairs
    // for (int i = 0; i < numbers.length; i++) {
    // int curr = numbers[i]; // 2, 4, 6, 8, 10
    // for (int j = i + 1; j < numbers.length; j++) { //pairs
    // System.out.print("(" + curr + "," + numbers[j] + ")"); // (2,4) (2,6) (2,8)
    // (2,10)
    // tp++;
    // }
    // System.out.println();
    // }
    // System.out.println("Total pairs:" + tp); // total pairs
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10 };
    // printPairs(numbers);
    // }

    // ---------------------------Sub-Array---------------------------

    // public static void printSubArrays(int numbers[]) {
    // int ts = 0;
    // for (int i = 0; i < numbers.length; i++) { // start
    // int start = i;
    // for (int j = i; j < numbers.length; j++) { // end
    // int end = j;
    // int sum = 0;
    // for (int k = start; k <= end; k++) { // print b/w start & end
    // System.out.print(numbers[k] + " ");

    // sum += numbers[k]; // accumulate sum
    // }
    // ts++;
    // System.out.println("-> Sum: " + sum);
    // }

    // System.out.println();

    // }
    // System.out.println("Total Pairs: "+ts);
    // }

    // public static void main(String[] args) {
    // int numbers[] = { 2, 4, 6, 8, 10 };
    // printSubArrays(numbers);

    // }
    // -----------------------------------------Max_subArray_Sum------------------------------------------------
    public static void MaxSubArraysSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maxSum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        MaxSubArraysSum(numbers);

    }

    // ---------------------------------------Khadanes_Algo------------------------------------------------
    // public static void Khadanes(int numbers[]) {
    // int currS = 0;
    // int maxS = Integer.MIN_VALUE;

    // for (int i = 0; i < numbers.length; i++) {
    // currS = currS + numbers[i];
    // if (currS < 0) {
    // currS = 0;
    // }
    // maxS = Math.max(currS, maxS);
    // }
    // System.out.println("Max Sum of Array is: " + maxS);
    // }

    // public static void main(String[] args) {
    // int numbers[] = { -2, -3, 4, -1, -1, 1, 5, -3 };
    // Khadanes(numbers);
    // }
    // }

}
