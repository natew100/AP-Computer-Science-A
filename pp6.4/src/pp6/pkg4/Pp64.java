package pp6.pkg4;
import java.util.Scanner;


public class Pp64 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int verse_count;
   //accepting verse count
   System.out.print("Enter the number of Verses: ");
   //accepting verse_count
   verse_count=input.nextInt();
   //printing new line
   System.out.println();
   for(int i=100;i>(100-verse_count);i--){
   //printing verse line
   System.out.println(i+" bottles of beer on the wall");
   //printing verse line
   System.out.println(i+" bottles of beer");
   //printing verse line
   System.out.println("if one of these bottles should happen to fall");
   //printing verse line
   System.out.println((i-1)+" bottles of beer on the wall");
   //printing new line
   System.out.println();
    }
  } 
}