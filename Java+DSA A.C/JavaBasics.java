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

    /*
     * int Income = sc.nextInt();
     * int Tax;
     * 
     * if (Income <= 500000){
     * Tax = 0;
     * }
     * else if (Income >= 500000 && Income <= 1000000){
     * Tax = (int) (Income * 0.2);
     * }
     * else{
     * Tax = (int)( Income * 0.3);
     * }
     * System.out.println("The Tax is: "+ Tax );
     * }
     */
    /*
     * int A = 1;
     * int B = 3;
     * int C = 2;
     * if (A>=B && A>=C) {
     * System.out.println("A is largest");
     * } else if (B>=C){
     * System.out.println("B is largest");
     * }
     * else
     * {System.out.println("C is largest");}
     * 
     */

    // TERNARY OPERATOR
    /*
     * int num1 = 2, num2 = 4;
     * boolean larger = (num1 > num2) ? true : false;
     * {
     * System.out.println(larger);
     * }
     * 
     * 
     * int number = 11;
     * String type = ((number % 2) == 0) ? "even" : "odd";
     * {
     * System.out.println(type);
     * }
     * 
     * 
     * int pass = 10;
     * String Result = (pass >= 33)? "pass" : "fail";{
     * System.out.println(Result);
     * }
     * 
     * 
     * int number = 2;
     * switch (number) {
     * case 1:
     * System.out.println("Samosa");
     * break;
     * case 2:
     * System.out.println("Momos");
     * break;
     * case 3:
     * System.out.println("Kebab");
     * }
     */
    /*
     * {
     * System.out.println("Enter a: ");
     * }
     * int a = sc.nextInt();
     * {
     * System.out.println("Enter b: ");
     * }
     * int b = sc.nextInt();
     * {
     * System.out.println("Enter operator: ");
     * }
     * char operator = sc.next().charAt(0);
     * 
     * switch (operator) {
     * case '+':
     * System.out.println(a + b);
     * break;
     * case '-':
     * System.out.println(a - b);
     * break;
     * case '*':
     * System.out.println(a * b);
     * break;
     * case '/':
     * System.out.println(a / b);
     * break;
     * default:
     * System.out.println("Will be added soon");
     * break;
     * }
     */
    // --------------------------------------04-01-24-----------------------------------------------
    // LOOPs
    /*
     * int counter = 1;
     * while (counter <= 7)
     * {
     * System.out.print(counter+" ");
     * counter++;
     * }
     * 
     * int n = 1;
     * int counter = sc.nextInt();
     * while (n<=counter)
     * 
     * {
     * System.out.println(counter+ " ");
     * counter++;
     * }
     * }
     * 
     * for(int i=1; i<=7; i++)
     * {
     * System.out.println("yoo");
     * }
     * 
     * for (int i = 1; i<=4; i++){
     * System.out.println("*****");
     * }
     * 
     * 
     * int n = sc.nextInt();
     * int sum = 0;
     * int i = 1;
     * while (i <= n) {
     * sum += i;
     * i++;
     * }
     * System.out.println("Sum of n natural no is: " + sum);
     * }
     * 
     * int counter = 1;
     * do{
     * System.out.println("Hey people");
     * counter++;
     * }
     * while(counter<=5);
     * 
     * // reverse of 250902
     * int n = 250902;
     * 
     * while (n > 0) {
     * int lastdigit = n % 10;
     * System.out.print(lastdigit);
     * n = n / 10;
     * }
     * //disp all no except miultiple of 10
     * 
     * do {
     * System.out.print("Enter number: ");
     * int n= sc.nextInt();
     * 
     * if (n%10==0) {
     * continue;
     * }
     * 
     * System.out.println("number is: " +n);
     * 
     * } while(true);
     * 
     * 
     * do {
     * System.out.println("Enter the number: ");
     * int n = sc.nextInt();
     * if (n % 10 == 0) {
     * break;
     * }
     * System.out.println("Number is: " + n);
     * 
     * } while (true);
     *
             // nested loops( Pattern )
 //Q1 
     * int n = 4;
     * int m = 5;
     * for(int i=1;i<=n;i++){
     * 
     * for(int j=1;j<=m;j++){
     * System.out.print("*");
     * }
     * System.out.println();
     * }
     * }
 //Q2
     * int n = 4;
     * int m = 5;
     * for (int i = 1; i <= n; i++) {
     * 
     * for (int j = 1; j <= m; j++) {
     * 
     * if (i == 1 || j == 1 || i == n || j == m) {
     * System.out.print("*");
     * } else {
     * System.out.print(" ");
     * }
     * 
     * }
     * System.out.println();
     * }
//Q3
     * int n = 4;
     * for(int i = 1; i <= n; i++){
     * for(int j = 1; j <=i; j++){
     * 
     * System.out.print("*");
     * }
     * System.out.println();
     * }
     
// Q4
    int n = 4;
    //outer loop
    for (int i = n; i >= 1; i--) {
      // innner loop
      for (int j = 1; j <= i; j++) {

        System.out.print("*");
      }
      System.out.println();
    }*/

  // Q5
  }
}

// S24216G6N1011231200026