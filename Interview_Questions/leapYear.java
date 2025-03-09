package Interview_Questions;
import java.util.Scanner;

public class leapYear {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Year");
        int LeapYear = sc.nextInt();
        if((LeapYear % 4 == 0 && LeapYear % 100 != 0) || (LeapYear % 400 == 0)){
            System.out.println("this is leap year");
        }else{
            System.out.println("Not leap year");
        }
    }
}
