import java.util.*;

public class Function {

    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        printHelloWorld(); // function call
    }

    // ----------Syntax with Parameters----------

    public static int calculateSum(int num1, int num2) { // parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(string args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter no a: ");
        int b = sc.nextInt();
        System.out.println("Enter no b: ");
        int sum = calculateSum(a + b); // arguments
        System.out.println("sum: " + sum);
    }

    // -----------------Call by Value----------------
    // ----- swap----
    public static void main(String args[]) {
        // swap - values exchange
        int a = 5;
        int b = 10;

        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    // -------OR-----(SWAP using function parameter)
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }

    // --------Product of a & b----------

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int prod = multiply(a, b);
        System.out.println("a * b:" + prod);
        prod = multiply(10, 5);
        System.out.println("a * b:" + prod);
    }

    // -----------------------09-01-24 /16-07-24----------------------------

    // ------- factorial of 2 no's---------

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f; // factorial of n
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    // //--------Binomial Coefficient--------

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
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

    public static void main(String[] args) {
    System.out.println(sum(2, 3));
    System.out.println(sum(4, 5, 8));

    // using Data Types
    // -- * // function to cal int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // -- * // function to cal float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
    System.out.println(sum(23.4f, 20.1f));
    System.out.println(sum(2, 10));

    // // - No is Prime or Not
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // completely divisible
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
    System.out.println(isPrime(8));

    // --- * // Find Prime with Optized sol
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return true;
    }

    // ---- * // Print prime no in Range-
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // completely divisible
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeInRange(50);
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

    public static void main(String[] args) {
    binToDeci(101);

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

    public static void main(String[] args) {
        dectoBin(7);
    }

    // ------------------ Scope----------------
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static int Avg(int avg1, avg2, avg3){
    int avg1= a;
    int avg2= b;
    int avg3= c;
    int Avg = avg1 + avg2 + avg3 / 3;
    }
    return Avg;
    }

    public static void main(String[] args) {
    Avg(0)
    }
}
