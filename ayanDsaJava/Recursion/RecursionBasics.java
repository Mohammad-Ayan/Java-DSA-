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
    // ---------------Print Factorial of N -----------

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }
    // ---------------Print Sum of N natural nos-----------

    public static int CalcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = CalcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }
    // ---------------Print Fabonacci Series-----------

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    // ----------------Array is Sorted or Not-----------------

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // --------------First_Occurance--------------

    public static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOcc(arr, key, i + 1);
    }

    // --------------Last_Occurance--------------

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

    // ----------Print x^n (Optimized)------------

    public static int OptimizedPower(int a, int n) { // O(log n)
        if (n == 0) {
            return 1;
        }

        int halfPower = OptimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    // -------------Tiling Problem------------

    public static int tilingProblem(int n) {// 2 x 1 (floor size)

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical
        int fnm1 = tilingProblem(n - 1);

        // horizontal
        int fnm2 = tilingProblem(n - 2);

        // ways
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    // ---------Remove Duplicates in a String------

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr); // required Ans
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }


    public static void main(String args[]) {
        // int n = 10;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(CalcSum(n));
        // System.out.println(fib(n));
        // int arr[] = { 2, 7, 3, 4, 3 };
        // System.out.println(firstOcc(arr, 3, 0));
        // System.out.println(lastOcc(arr, 3, 0));
        // System.out.println(firstOcc(arr, 4, 0));
        // System.out.println(printPower(2, 10));
        // System.out.println(OptimizedPower(2, 10));
        // System.out.println(tilingProblem(3));
        String str = "appna";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
 