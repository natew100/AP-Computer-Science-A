package pp6.pkg11;
import java.util.Random;

public class Pp611 
{


    public static void main(String[] args) 
    {
        // reate random instance
        Random rand = new Random();
        // for loop to get 20 lines
        for (int i = 0 ; i < 20 ; i++)
        {
            int length = rand.nextInt(20) + 1;
            // print until random
            for (int x = 0 ; x < length; x++)
                System.out.print("_");
            System.out.println("");
        }
    }

}