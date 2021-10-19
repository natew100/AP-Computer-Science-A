package pp3.pkg7;
import java.util.Scanner;

public class Pp37 {
    public static void main(String[] args) {
    double a, b,c, area, S;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter side a: ");
    a= scanner.nextDouble();
    System.out.println("Enter side b: ");
    b= scanner.nextDouble();
    System.out.println("Enter side c: ");
    c= scanner.nextDouble();
    S=(a+b+c)/2;
    area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
    System.out.printf("\nThe Area of triangle = %.3f\n", area);
    }
}
