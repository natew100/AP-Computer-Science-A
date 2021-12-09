package pp7.pkg2;
import java.util.*;


public class Pp72 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // init scanner
        int a, b, c;
        System.out.print("Enter First Value: ");
        a = input.nextInt();
        System.out.print("Enter Second Value: ");
        b = input.nextInt();
        System.out.print("Enter Third Value: ");
        c = input.nextInt();
        // call average method with 3 ints passed
        System.out.println("The Average Is: "+average(a,b,c));
    }
    
    public static double average(int a,int b,int c)
       {return (a+b+c)/2.0;
       }
}