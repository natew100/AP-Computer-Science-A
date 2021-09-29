
package pp26;
import java.util.Scanner;
public class Pp26 {

    public static void main(String[] args) {
        final double milesPerKiloMeter = 1.60935;
        double miles, kilometers;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter Number of Miles: ");
        miles = scan.nextDouble();
        kilometers = milesPerKiloMeter * miles;
        System.out.println ("Distance Inputted In Kilometers Is: " + kilometers);
    } 
}
