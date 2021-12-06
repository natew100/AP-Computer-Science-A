package pp5.pkg12;
import java.util.*;
import java.io.*;

public class Pp512 {
    public static void main(String args[])throws IOException
        {
            // init players
            int a = 0, b = 0, c = 0, d = 0, par = 0;
            // scan file
            Scanner fileScan = new Scanner(new File("C:\\Users\\3009496\\Desktop\\AP-Computer-Science-A\\pp5.12\\src\\pp5\\pkg12\\golfscores"));
            while (fileScan.hasNext())
                {
                    par += fileScan.nextInt();
                    a += fileScan.nextInt();
                    b += fileScan.nextInt();
                    c += fileScan.nextInt();
                    d += fileScan.nextInt();
                }
            // array list
            ArrayList<String> totals = new ArrayList<String>();
            totals.add("Par: " + par);
            totals.add("Player 1: " + a);
            totals.add("Player 2: " + b);
            totals.add("Player 3: " + c);
            totals.add("Player 4: " + d); 

            int winner = Math.min(Math.min(Math.min(a,b),c),d);
            // prints scores
            System.out.println("| Par | Player 1 | Player 2| Player 3 | Player 4 |");
            System.out.println("|  " + par + " |   " + a + "     |   "+ b + "    |   "+ c + "     |   " + d + "     |");
            System.out.println("The winner(s) is/: ");
            if(winner==a)
                System.out.println("Player 1 Wins");
            if(winner==b)
                System.out.println("Player 2 Wins");
            if(winner==c)
                System.out.println("Player 3 Wins");
            if(winner==d)
                System.out.println("Player 4 Wins");
        }
    }