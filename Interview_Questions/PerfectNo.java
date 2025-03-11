package Interview_Questions;

import java.util.Scanner;

public class PerfectNo {
    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;  // If sum of divisors equals the number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        if (isPerfect(num)) {
            System.out.println(num + " a perfect Number");
        } else {
            System.out.println(num + " is not Perfect Number");
        }
    }
}
