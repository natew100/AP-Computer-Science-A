package pp8.pkg1;
import java.util.Scanner;

public class Pp81 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count[] = new int[51];

        System.out.print("Enter a number between 0-50: ");
        int num = scan.nextInt();

        while (num >= 0 && num <= 50) {
            // Increment value at index num in count array by 1
            count[num] += 1;

            // Ask user to enter another
            System.out.print("Enter a number between 0-50: ");
            num = scan.nextInt();
        }

        // Print count array
        for (int i = 0; i < 51; i++) {
            if (count[i] >= 1)
                System.out.println(i + ": " + count[i]);
        }
  }
}