package Recursion;

public class RecursionBasics {
    // ----- Print numbers from n to 1(Decreasing Order)-------

    public static void printDec(int n) {
        // Base Case
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // ----- Print numbers from 1 to n(Increasing Order)-------

    public static void printInc(int n) {
        // Base Case
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int CalcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = CalcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOcc(arr, key, i + 1);
    }

    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOcc(arr, key, i + 1);

        if (isFound != -1) {
            return isFound;
        }

        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }

    // ---------Print x^n ------------

    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * printPower(x, n - 1);
    }

    // ---------Print x^n (Optimized)------------

    public static int OptimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPowerSq =  OptimizedPower(a, n/2) * OptimizedPower(a, n/2);
        
       if (n % 2 != 0){
        halfPowerSq =  a * halfPowerSq;
       }
       return halfPowerSq;
    }

    public static void main(String args[]) {
        // int n = 10;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(CalcSum(n));
        // System.out.println(fib(n));
        int arr[] = { 2, 7, 3, 4, 3 };
        // System.out.println(firstOcc(arr, 3, 0));
        // System.out.println(lastOcc(arr, 3, 0));
        // System.out.println(firstOcc(arr, 4, 0));
        // System.out.println(printPower(2, 10));
        System.out.println(OptimizedPower(2, 10));
    }
}
