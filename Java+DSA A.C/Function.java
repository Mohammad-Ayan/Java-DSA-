import java.util.*;

public class Function {
    // public static void printHelloWorld() {
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // }

    // public static void printSum() {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // System.out.println("Enter no a: ");
    // int b = sc.nextInt();
    // System.out.println("Enter no b: ");
    // int sum = a + b;
    // System.out.println("sum: "+ sum);
    // }
    // public static int calculateSum(int num1, int num2) { // parameters

    //     int sum = num1 + num2;
    //     return sum;
    // }

    // public static void swap(int a, int b) {
    //     // swap
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a: " + a);
    //     System.out.println("b: " + b);
    // }
    public static void multiply(int a, int b) {
       int product = a*b;
       
return product();
    }

    public static void main(String[] args) {
        // printHelloWorld(); // function calling
        // printSum();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); //arguments
        // System.out.println("sum:"+ sum);

        // SWAP
        // int a = 5;
        // int b = 4;
        // swap(a, b);
        int a = 5;
        int b = 4;
        int prod = multiply(a, b);
      
       System.out.println("a*b = "+ prod);
multiply(10, 20);
    }
}