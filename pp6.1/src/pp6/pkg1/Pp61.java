package pp6.pkg1;
import java.util.*;


public class Pp61 {   
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int sum = 0;
       System.out.print("Enter a Number Greater Than 2 : ");
       int n = s.nextInt();
      
       if(n < 2) // if less than 2
       {
       System.out.print("Error : The number entered is less than 2 ");
       }
       else{
       for(int i = 2; i <= n; i++)
       {
       if(i % 2 == 0)
       {
       sum = sum + i; // add even numbers
       }
       }
       System.out.println("Result : " + sum); // print the sum
       }
    }
}