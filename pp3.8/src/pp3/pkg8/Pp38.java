package pp3.pkg8;
import java.util.Random;

public class Pp38 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(21) + 20;
        System.out.println("Generated number: " + num);
        System.out.println("Sine: " + Math.sin(num));
        System.out.println("Cosine: " + Math.cos(num));
        System.out.println("Tangent: " + Math.tan(num));
    } 
}
