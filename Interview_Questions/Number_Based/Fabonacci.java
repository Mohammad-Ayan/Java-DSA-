package Interview_Questions.Number_Based;
import java.util.Scanner;


public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int first = 0;
        int second = 1;

        for (int i = 2; i <= num; i++) {
            int next = first + second;
            System.out.print(next + " ");

             // Update values for the next iteration
            first = second;
            second = next;
        }
    }

    // using Recursion
    public static int fib(int n) {
    if (n == 0 || n == 1) {
    return n;
    }
    int fnm1 = fib(n - 1);
    int fnm2 = fib(n - 2);
    int fn = fnm1 + fnm2;
    return fn;
    }

//     public static void main(String[] args) {
//     fib(34);
//     }
}
