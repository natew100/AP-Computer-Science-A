package pp8.pkg5;
import java.util.*;

public class Pp85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vals = new double[50];
        double mean=0, var=0;
        int count;
        count=0;
        System.out.println("Enter Numbers: ");
        System.out.println("Enter any non number when done inputting values.");
        //while loop here
        while(true){
            try{
                double temp = input.nextDouble();
                vals[count++] = temp;
            }
            catch(InputMismatchException e){
                break;
            }
        }
        // for loop
        for(int i=0;i<count; i++) mean += vals[i];
        mean = mean/count;
        
        for(int i=0;i<count; i++) var += (vals[i]-mean)*(vals[i]-mean);
        var = var/count;
        var = Math.sqrt(var);
      
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + var);
    }
}