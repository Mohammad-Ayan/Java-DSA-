public class Recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }

        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printDec(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        // printInc(n);
        // printFact(n);
    }
}
