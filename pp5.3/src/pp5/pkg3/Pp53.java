package pp5.pkg3;
import java.util.Scanner;

// nate wolf

public class Pp53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt(), d;
        while (n > 0) {
            // while loop
            d = n % 10;
            // divide by 10
            if (d == 0) {
                System.out.println(d + " is zero");
            } else if (d % 2 == 0) {
                System.out.println(d + " is even");
            } else {
                System.out.println(d + " is odd");
            }
            n /= 10;
        }
    }
}