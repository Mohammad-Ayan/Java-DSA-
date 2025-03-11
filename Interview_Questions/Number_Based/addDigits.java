package Interview_Questions.Number_Based;
import java.util.Scanner;

// Given a number, find the sum of its digits (53 ~ {5+3 = 8})
public class addDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        sc.close();

        int num = sc.nextInt();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }


// Using Recursion
    public static int digitSum(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);

    }

    // public static void main(String[] args) {
    //     int result = digitSum(14678);
    //     System.out.println("sum of the all digits is :" + result);
    // }
}