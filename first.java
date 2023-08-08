public class first{

   /*  public static void main(String[] args) {
        int number = 5; // Change this to the desired number
        printMultiplicationTable(number);
    }
 public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
    
} */
 public static void pattern(int n) {
 
    for (int i = 0; i<n; i++){
       for (int j = 0; j<i+1; j++){
       System.out.print("*");
       }

       System.out.println();
    }
}

       public static void main(String[] args) {
        int n = 5; // Change this to the desired number
        pattern (n);
       }
    }

