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
//  public static void pattern(int n) {
 
//     for (int i = 0; i<n; i++){
//        for (int j = 0; j<i+1; j++){
//        System.out.print("*");
//        }

//        System.out.println();
//     }
// }

//        public static void main(String[] args) {
//         int n = 5; // Change this to the desired number
//         pattern (n);
//        }
//     }

//Recursive_Function
// static int sumRec(int n){
//     if(n==1){
//     return 1;
// }
// return n + sumRec(n-1);
// }
// public static void main(String[] args) {
//     System.out.println(sumRec(5));
// }
// }

// public static void pattern(int n) {
 
//      for (int i = 0; i<n; i++){
//         for (int j = n; j>i+1; j--){
//         System.out.print("*");
//         }

//         System.out.println();
//      }
//  }

//         public static void main(String[] args) {
//          int n = 5; // Change this to the desired number
//         pattern (n);
//         }
//      }


     public static int fib(int n){
        if (n==1 || n==2){
        return n-1;
     }
     else{
        return fib (n-1) + (n-2);}
    }

     public static void main(String[] args) {
        int result = fib(7);
        System.out.println(result);
     }
     }