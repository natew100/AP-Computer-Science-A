package pp2.pkg9;
import java.util.Scanner;


public class Pp29 {
    public static void main(String[] args) {
        int numSecond,hour, minute, second;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter Seconds:");
        numSecond = scan.nextInt();
        hour = numSecond / 3600;
        minute = numSecond / 60 - hour * 60;
        second = numSecond - minute * 60 - hour * 3600;
        System.out.println ("Hours: " + hour);
        System.out.println ("Minutes: " + minute);
        System.out.println ("Seconds: " + second);
    }
}
