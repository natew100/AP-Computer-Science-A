package pp2.pkg7;
import java.util.Scanner;
public class Pp27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double speed, totalTravelTime;
        int distanceTraveled;
        System.out.print("Enter the Travel Distance: ");
        distanceTraveled = scan.nextInt();
        System.out.print("Enter the Travel Speed: ");
        speed = scan.nextDouble();
        totalTravelTime = distanceTraveled / speed;
        System.out.println("Hours Needed To Travel: " + totalTravelTime);
    }
}