package pp2.pkg8;
import java.util.Scanner;


public class Pp28 {

    public static void main(String[] args) {
        int seconds, minutes, hours, totalSeconds;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter Seconds: ");
        seconds = scan.nextInt();
        System.out.print("Enter Minutes: ");
        minutes = scan.nextInt();
        System.out.print("Enter Hours: ");
        hours = scan.nextInt();
        totalSeconds = 3600*hours+60*minutes+seconds;
        System.out.println("total Number of Seconds: " + totalSeconds);
    }
    
}

