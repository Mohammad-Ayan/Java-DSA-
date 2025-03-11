package Interview_Questions.Number_Based;

import java.util.Scanner;

// Sum of first N natural Nos
public class sumNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        sc.close();
        
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("the sum of 3 " + n + "no is " + sum);
    }

    // using Recursion
    
    public static int CalcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = CalcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }
    // public static void main(String[] args) {
    //     CalcSum(34);
    // }
}