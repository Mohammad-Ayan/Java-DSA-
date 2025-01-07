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

    // -----------------Odd_Or_Even(bitMask)---------------

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

    // ----------------Get_ith_bit -----------------

    // public static int getIthBit(int n, int i) {
    // int bitMask = 1 << i;
    // if ((n & bitMask) == 0) {
    // return 0;
    // } else {
    // return 1;
    // }
    // }

    // public static void main(String[] args) {
    // System.out.println(getIthBit(10, 2)); // 1010 --> 0/1
    // }

    // -------------------Set ith bit----------------

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // public static void main(String[] args) {
    //     System.out.println(setIthBit(10, 2)); // 1010 --> 1000
    // }

    // -------------------Clear ith bit----------------

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // public static void main(String[] args) {
    //     System.out.println(clearIthBit(10, 1)); // 1010 -->  1000
    // }
 
    // -------------------Update ith bit----------------

    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit == 0) {
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
