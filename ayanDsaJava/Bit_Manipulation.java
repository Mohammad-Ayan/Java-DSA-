public class Bit_Manipulation {
    // public static void main(String[] args) {
    // // System.out.println(5|6);
    // // System.out.println(5&6);
    // // System.out.println(5^6);
    // // System.out.println(~0);
    // // System.out.println(~5);
    // // System.out.println(5<<2);
    // // System.out.println(6>>1);

    // }

    // ---------------------------------------Odd_Or_Even=--------------------------------------------
    // public static void OddOrEven(int n) {
    // int bitMask = 1;
    // if ((n & bitmask) == 0) {
    // System.out.println("Even");
    // } else {
    // System.out.println("Odd");
    // }
    // }

    // public static void main(String[] args) {
    // OddOrEven(5);
    // OddOrEven(9);
    // OddOrEven(2);
    // }
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
    }
}
