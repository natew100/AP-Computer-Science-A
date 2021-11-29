package ppmonthcase;
import java.util.Scanner;


public class PpMonthCase {
    public static String getMonth(int num){
        switch (num){
            case 1:
                return "31 days";
            case 2:
                return "28 days";
            case 3:
                return "31 days";
            case 4:
                return "30 days";
            case 5:
                return "31 days";
            case 6:
                return "30 days";
            case 7:
                return "31 days";
            case 8:
                return "31 days";
            case 9:
                return "30 days";
            case 10:
                return "31 days";
            case 11:
                return "30 days";
            case 12:
                return "31 days";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, year;
        System.out.print("Enter a Month 1-12: ");
        month = scanner.nextInt();
        System.out.println("Enter a Year: ");
        year = scanner.nextInt();
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
        String res = getMonth(month);
        System.out.println(res);
    }
}
