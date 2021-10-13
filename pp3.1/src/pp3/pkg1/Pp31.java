package pp3.pkg1;
import java.util.Scanner;

public class Pp31 {
    public static void main(String[] args) {
    String FirstName, LastName, Result;
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter First Name: ");
    FirstName=input.next();
    System.out.print("Please Enter Last Name: ");
    LastName=input.next();
    System.out.println("Name is: "+FirstName+" "+LastName);
    int randomNum = 10 + (int)(Math.random()*99);
    Result=FirstName.substring(0,1)+LastName.substring(0,4)+randomNum;
    System.out.println("Output is: "+Result);
    }
}
