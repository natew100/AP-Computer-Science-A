package pp6.pkg2;
import java.util.Scanner;


public class Pp62 {
    public static void main(String[] args) {
       System.out.println("Please enter your words");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        for(char a : word.toCharArray())
        {
            System.out.println(a);
        }
    }
}