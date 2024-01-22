import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long maxGCD = 0;
        long maxLCM = (long) N * (N - 1) / 2; // Maximum LCM for consecutive numbers

        for (int i = 2; i <= N; i++) {
            maxGCD = calculateGCD(maxGCD, i);
        }

        long difference = maxLCM - maxGCD;
        System.out.println(difference);
    }

    // Function to calculate GCD (Euclidean Algorithm)
    private static long calculateGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
