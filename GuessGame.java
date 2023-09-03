import java.util.Random;
import java.util.Scanner;

public class GuessGame{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 and 100");
        int attempts = 0;

        Random random = new Random();
        int computerInput = random.nextInt(100)+1;
        
        while (true) {
            System.out.print("Enter your guess: ");
        int userInput = sc.nextInt();
        attempts++; 
    
    
    //     if (userInput == computerInput){
    //         System.out.println("Congratulations, You Guess the Right Answer");
    //     }
    //     else if (userInput < 50 && computerInput > 51){
    //         System.out.println("You Win");

    // }
    
    if (userInput == computerInput) {
        System.out.println("Congratulations, You guessed the right number in " + attempts + " attempts!");
        break; // Exit the loop, game over
    } else if (userInput < computerInput) {
        System.out.println("Try again. Your guess is too low.");
    } else {
        System.out.println("Try again. Your guess is too high.");
    }
}
sc.close();
}
}
