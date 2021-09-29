package pp23;
import java.util.Scanner;
public class Pp23 {
    public static void main(String[] args) {
        float num1, num2;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter the first number: ");
        num1 = scan.nextFloat();
        System.out.print ("Enter the second number: ");
        num2 = scan.nextFloat();
        System.out.println ("The Sum of the 2 Numbers is: " + (num1+num2));
        System.out.println ("The Difference of the 2 Numbers is: " + (num1-num2));
        System.out.println ("The Product of the 2 Numbers is: " + (num1*num2));
    }
}
