import java.util.Scanner;

public class JavaBasics {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String input = sc.next();
    // System.out.println(input);

    // String input = sc.nextLine();
    // System.out.println(input);

    // Number input = sc.nextInt();
    // System.out.println(input);
    // Float price = sc.nextFloat();
    // System.out.println(price);

    /*
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * int c = a*b;
     * System.out.println(c);
     */
    // float pie = 3.14;
    // float radius = sc.nextFloat();
    // float area = 3.14f * radius * radius;
    // System.out.println(area);
    // int a = 10;
    // int b = a++;
    // System.out.println(a);
    // System.out.println(b);

    // ASSIGNMENT OPERATORS
    // int a = 10 ;
    // a += 10;
    // System.out.println(a);

    /*
     * int Age = 24;
     * 
     * if (Age <= 18) {
     * System.out.println("not elligible for vote");
     * }
     * if (Age >= 18 && Age <= 60) {
     * System.out.println("Voter is young");
     * } else {
     * System.out.println("elligible for vote");
     * }f
     */

    /*
     * int A = 3;
     * int B = 5;
     * if (A >= B) {
     * System.out.println("A is largest number");
     * } else {
     * System.out.println("B is largest number");
     * }
     */

    /*
     * int number = sc.nextInt();
     * if (number%2 == 0) {
     * System.out.println("The number is even");
     * } else {
     * System.out.println("Number is odd");
     * }
     */

    /*
     * int Age = sc.nextInt();
     * if (Age == 18) {
     * System.out.println("Elligible for Vote from this year");
     * } else if (Age <= 18) {
     * System.out.println("You are not Elligible to Vote");
     * }
     * else {
     * System.out.println("You are now ellible to Vote");
     * }
     */

     int Income = sc.nextInt();
     int Tax;

     if (Income <= 500000){
     Tax = 0;
     }
       else if (Income >= 500000 && Income <= 1000000){
     Tax = (int) (Income * 0.2); 
       }
      else{
      Tax = (int)( Income * 0.3);
      }
       System.out.println("The Tax is: "+ Tax );
     }
    }
  
