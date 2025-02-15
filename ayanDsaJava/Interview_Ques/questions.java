package Interview_Ques;

import java.util.Scanner;

public class questions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by 3 & 5 both");
        }
        
        else if(num % 3 == 0){
            System.out.println("Divisible by 3");
        }

        else if(num % 5 == 0){
            System.out.println("Divisible by 5");
        }

        else {
            System.out.println("Not divisible by both");
        }
    }
}
