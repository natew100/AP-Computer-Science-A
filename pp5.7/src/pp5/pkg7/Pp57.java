package pp5.pkg7;
import java.util.Scanner;
import java.util.Random;


public class Pp57 {
    public static void main(String[] args)
    {
        final int scissors = 0, rock = 1, paper = 2;
        // init diff types
        int userselection, computerselection;
        String other; 
        Scanner scstr = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Random rad = new Random(); 

        System.out.print("Type 'yes' to play, 'quit' to quit: ");
        other = scstr.nextLine();

        while(other.equalsIgnoreCase("yes"))
        // start loop
        {
         computerselection = rad.nextInt(2);
         System.out.println();
         System.out.println("0 for scissors, 1 for rock and 2 for paper: ");
         userselection = sc.nextInt();
         
         // if else case
         if((userselection == rock && computerselection == rock) || 
              (userselection == paper && computerselection == paper) ||
              (userselection == scissors && computerselection ==scissors))
         {
              System.out.println("Result: Tie");
         }
         else if((userselection== rock && computerselection == scissors) 
              || (userselection == scissors && computerselection == paper)
              || (userselection == paper && computerselection == rock))
         {
              System.out.println("Result: User Wins");
         }
         else
         {
              System.out.println("Result: Computer Wins");
         }

         System.out.print("Play Again? 'yes' to play, 'quit' to quit: ");
         other = scstr.nextLine();
    }
  }
}