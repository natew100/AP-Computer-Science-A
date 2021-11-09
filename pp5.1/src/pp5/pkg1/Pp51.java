package pp5.pkg1;
import java.util.Scanner;

public class Pp51 {
    public static void main(String[] args)
    {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        year = scan.nextInt();

        if(year <= 1582)
        {
            System.out.println("Invalid Year. Georgian Calendar was adopted in this year.");
        }
        else
        {
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            }
            // not a leap year if divisible by 100
            // but not divisible by 400
            else if (year % 100 == 0) {
                System.out.println(year + " is not a leap year.");
            }
            // leap year if not divisible by 100
            // but divisible by 4
            else if (year % 4 == 0) {
                System.out.println(year + " is a leap year.");
            }
            // all other years are not leap years
            else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}