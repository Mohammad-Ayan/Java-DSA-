package Interview_Questions;

import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args) {
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int temp = n, sum = 0, digits = 0;

        // Count the number of digits
        int num = temp;
        while (n > 0) {
            n = n / 10;
            digits++;
        }

        // Calculate sum of digits raised to power of number of digits
        num = temp;
        while (num > 0) {
            int r = num % 10;
            sum += Math.pow(r, digits); // Raising to correct power
            num /= 10;
        }

        if (temp == sum) {
            System.out.println("The number is armstrongNo");
        } else {
            System.out.println("Not armstrongNo");
        }
    }



//-- best Approach

public static boolean isArmstrong(int number) {
    int originalNumber = number;
    int sum = 0;
    int numberOfDigits = String.valueOf(number).length();

    while (number > 0) {
        int digit = number % 10;
        sum += Math.pow(digit, numberOfDigits);
        number /= 10;
    }

    return sum == originalNumber;
}

// public static void main(String[] args) {
//     int number = 153;
//     if (isArmstrong(number)) {
//         System.out.println(number + " is an Armstrong number.");
//     } else {
//         System.out.println(number + " is not an Armstrong number.");
//     }
// }
}