package pp3.pkg9;
import java.util.Random;

public class Pp39 {
    public static void main(String[] args) {
        Random random = new Random();
        int radius = random.nextInt(20)+1;
        int height = random.nextInt(20)+1;
        double volume = Math.PI*radius*radius*height;
        double area = 2*Math.PI*radius*height;
        System.out.println("Volume = "+volume);
        System.out.println("Surface are = "+area);
    }
}