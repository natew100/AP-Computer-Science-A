package pp25;
import java.util.Scanner;

public class Pp25 {
    public static void main(String[] args) {
        float temperature, finalTemp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        temperature = in.nextInt();
        finalTemp = ((temperature - 32)*5)/9;
        System.out.println("temperature in Celsius = " + finalTemp);
    }
    
}
