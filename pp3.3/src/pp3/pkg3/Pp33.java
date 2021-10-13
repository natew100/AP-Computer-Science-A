package pp3.pkg3;
import java.util.Random;

public class Pp33 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print(random.nextInt(7) + 1);
        System.out.print(random.nextInt(8));
        System.out.print(random.nextInt(8));
        System.out.print("-");
        System.out.printf("%03d", random.nextInt(656));
        System.out.print("-");
        System.out.printf("%04d\n", random.nextInt(10000));
    }
}