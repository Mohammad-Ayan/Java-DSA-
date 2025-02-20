package Function;
import java.util.*;

public class Function {

    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    // ----------Syntax with Parameters----------

    public static int calculateSum(int num1, int num2) { // parameters
        int sum = num1 + num2;
        return sum;
    }

    // -----------------Call by Value----------------
    // ----- swap----
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    // --------Product of a & b----------
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // ------- factorial of 2 no's---------
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // factorial of n
    }

    // //--------Binomial Coefficient--------
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    // //---------- Function overloading-----------
    // using Parameters
    // -- * // function to add 2 no's
    public static int sum(int a, int b) {
        return a + b;
    }

    // -- * // function to add 3 no's
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // -- * // function to cal float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    // // - No is Prime or Not
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ---- * // Print prime no in Range-
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // -----Convert from Binary to Decimal-----
    public static void binToDeci(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int deciNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            deciNum = deciNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + deciNum);
    }

    // -----Convert from Decimal to Binary-----
    public static void dectoBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of " + myNum + " = " + binNum);
    }

    // ------------------ Scope----------------
    public static int Avg(int avg1, int avg2, int avg3) {
        return (avg1 + avg2 + avg3) / 3;
    }

    public static void main(String[] args) {
        printHelloWorld(); // function call

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no a: ");
        int a = sc.nextInt();
        System.out.println("Enter no b: ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("sum: " + sum);

        int x = 5;
        int y = 10;
        swap(x, y);

        int prod = multiply(3, 4);
        System.out.println("a * b: " + prod);
        prod = multiply(10, 5);
        System.out.println("a * b: " + prod);

        System.out.println(factorial(4));
        System.out.println(binCoeff(5, 2));

        System.out.println(sum(2, 3));
        System.out.println(sum(4, 5, 8));
        System.out.println(sum(23.4f, 20.1f));
        System.out.println(sum(2, 10));

        System.out.println(isPrime(8));
        primeInRange(50);

        binToDeci(101);
        dectoBin(7);

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Average: " + Avg(10, 20, 30));
    }
}
