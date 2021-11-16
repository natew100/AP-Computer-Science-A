package pp5.pkg4;
import java.util.Random;
import java.util.Scanner;

// nate wolf


public class Pp54 {
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       Random r = new Random();
       int numOfGuess = 0;
       int randNum = r.nextInt(100) + 1;
       System.out.print("Enter Your Guess: (-1 to quit): ");
       while(true){
           int guess = scan.nextInt();
           if(guess == -1){
               break;
           }
           numOfGuess++;
           if(guess < randNum){
               System.out.print("Your guess is too low. Please guess again. (-1 to quit): ");
           }
           else if(guess > randNum){
               System.out.print("Your guess is too high. Please guess again. (-1 to quit): ");
           }
           else{
               System.out.print("You guessed the number after " + numOfGuess + " tries.");
               // reset counter after success
               numOfGuess = 0;
               System.out.println();
               System.out.print("Would you like to guess another number?(yes/no): ");
               String s = scan.next();
               // check if they want to play again
               if(s.equalsIgnoreCase("no")){
                   break;
               }
               else{
                   randNum = r.nextInt(100) + 1;
                   System.out.print("Please guess the number(-1 to quit): ");       }
           }
       }
    }   
}