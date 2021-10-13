package pp3.pkg5;
import java.util.Scanner;


public class Pp35 {
    public static void main(String[] args) {
        double x1,x2,y1,y2, distance;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X value for point 1: ");
        x1 = scanner.nextDouble();
        System.out.print("Enter Y value for point 1: ");
        y1 = scanner.nextDouble();
        System.out.print("Enter X value for point 2: ");
        x2 = scanner.nextDouble();
        System.out.print("Enter Y value for point 2: ");
        y2 = scanner.nextDouble();        
        distance = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);        
        System.out.printf("Distance: %.3f\n", distance);
    }
}