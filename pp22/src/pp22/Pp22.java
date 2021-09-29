package pp22;
import java.util.Scanner;
public class Pp22 {
    public static void main(String[] args) {
        double input1, input2, input3, sumOfNumbers, averageOfNumbers;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        input1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        input2 = scan.nextDouble();
        System.out.print("Enter the third number: ");
        input3 = scan.nextDouble();
        scan.close();
        sumOfNumbers = input1 + input2 + input3;
        averageOfNumbers = sumOfNumbers/3;
        System.out.println("The Average of the 3 Numbers Is: " + averageOfNumbers);        
    }
}
