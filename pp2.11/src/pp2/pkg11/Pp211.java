
package pp2.pkg11;
import java.util.Scanner;

public class Pp211 {

    public static void main(String[] args) {
        int tens,fives,ones,quarters,dimes,nickles,pennies,amt;
        double amount;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        amount=in.nextDouble();
        amt=(int)(amount*100);
        tens=amt/1000;
        amt%=1000;
        fives=amt/500;
        amt%=500;
        ones=amt/100;
        amt%=100;
        quarters=amt/25;
        amt%=25;
        dimes=amt/10;
        amt%=10;
        nickles=amt/5;
        pennies=amt%5;
        System.out.println(tens +" ten dollar bills");
        System.out.println(fives +" five dollar bills");
        System.out.println(ones +" one dollar bills");
        System.out.println(quarters +" quarters");
        System.out.println(dimes +" dimes");
        System.out.println(nickles +" nickles");
        System.out.println(pennies +" pennies");
    }
}
