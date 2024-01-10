import java.util.*;

public class Function {
    /*
     * public static void printHelloWorld() {
     * System.out.println("Hello World");
     * System.out.println("Hello World");
     * System.out.println("Hello World");
     * }
     * 
     * public static void printSum() {
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * System.out.println("Enter no a: ");
     * int b = sc.nextInt();
     * System.out.println("Enter no b: ");
     * int sum = a + b;
     * System.out.println("sum: "+ sum);
     * }
     * public static int calculateSum(int num1, int num2) { // parameters
     * 
     * int sum = num1 + num2;
     * return sum;
     * }
     * 
     * public static void swap(int a, int b) {
     * // swap
     * int temp = a;
     * a = b;
     * b = temp;
     * System.out.println("a: " + a);
     * System.out.println("b: " + b);
     * }
     * public static int multiply(int a, int b) {
     * int product = a * b;
     * 
     * return product;
     * }
     * 
     * public static void main(String[] args) {
     * printHelloWorld(); // function calling
     * printSum();
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * int sum = calculateSum(a, b); //arguments
     * System.out.println("sum:"+ sum);
     * 
     * SWAP
     * int a = 5;
     * int b = 4;
     * swap(a, b);
     * int a = 5;
     * int b = 4;
     * int prod = multiply(a, b);
     * 
     * System.out.println("a*b = " + prod);
     * multiply(10, 20);
     * System.out.println("a*b: " + prod);
     * 
     * public static int calculateProduct(int a,int b){
     * int product =a*b;
     * return product;
     * }
     * 
     * // public static void main(String[]args){
     * 
     * int product=calculateProduct(3,4);
     * System.out.println(product);
     * }
     * }
     */
    // -----------------------------------------09-01-24------------------------------------------------------------------
    /*
     * factorial of 2 no's
     * 
     * public static int factorial(int n) {
     * int f = 1;
     * for (int i = 1; i <= n; i++) {
     * f = f * i;
     * 
     * }
     * return f; // factorial of f
     * }
     * 
     * // Binomial Coefficient
     * 
     * public static int binCoeff(int n, int r) {
     * int fact_n = factorial(n);
     * int fact_r = factorial(r);
     * int fact_nmr = factorial(n - r);
     * 
     * int binCoeff = fact_n / (fact_r * fact_nmr);
     * return binCoeff;
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println(binCoeff(5, 2));
     * 
     * // Function overloading
     * // function to add 3 no's
     * public static int sum(int a, int b) {
     * return a + b;
     * }
     * 
     * // function to add 3 no's
     * public static int sum(int a, int b, int c) {
     * return a + b + c;
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println(sum(2, 3, 5));
     * System.out.println(sum(4, 50));
     * 
     * public static int sum(int a, int b){
     * return a+b;
     * }
     * public static float sum(float a, float b){
     * return a+b;
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println(sum(23.4f, 20.1f));
     * System.out.println(sum(2, 10));
     * // Prime or Not
     * public static boolean isPrime(int n) {
     * boolean isPrime = true;
     * for (int i = 2; i <= n - 1; i++) {
     * if (n % i == 0) {
     * isPrime = false;
     * 
     * }
     * }
     * return isPrime;
     * }
     * 
     * public static void main(String[] args) {
     * System.out.println(isPrime(8));
     * 
     * // Find Prime with Optized sol
     * public static boolean isPrime(int n){
     * boolean isPrime = true;
     * for(int i=2; i<=Math.sqrt(n); i++){
     * if(n % i==0){
     * isPrime = false;
     * }
     * }
     * return isPrime;
     * }
     * public static void main(String[] args) {
     * System.out.println(isPrime(4));
     * 
     * public static boolean isPrime(int n) {
     * boolean isPrime = true;
     * for (int i = 2; i <= Math.sqrt(n); i++) {
     * if (n % i == 0) {
     * isPrime = false;
     * }
     * }
     * return isPrime;
     * }
     * 
     * // Print prime no in Range
     * public static void primeInRange(int n) {
     * 
     * for (int i = 2; i <= n; i++) {
     * if (isPrime(i)) {
     * System.out.print(i + "  ");
     * }
     * }
     * System.out.println();
     * }
     * 
     * public static void main(String[] args) {
     * primeInRange(50);
     */
}
