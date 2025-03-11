package Interview_Questions;

import java.util.Scanner;

// Given a number, find the sum of its digits (53 ~ {5+3 = 8})
public class addDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}