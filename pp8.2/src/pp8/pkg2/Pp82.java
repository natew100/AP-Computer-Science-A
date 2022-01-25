package pp8.pkg2;
import java.util.Scanner;

public class Pp82 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count[] = new int[51];

        System.out.print("Enter a number between -25 and 25: ");
        int num = scan.nextInt();

        while (num >= -25 && num <= 25) {
            // Increment value at index num in count array by 1
            count[num + 25] += 1;

            // Ask user to enter another
            System.out.print("Enter a number between -25 and 25 ");
            num = scan.nextInt();
        }

        // Print count array
        for (int i = 0; i < 51; i++) {
            if (count[i] >= 1)
                System.out.println((i - 25) + ": " + count[i]);
        }
  }
}