package pp19;
public class Pp19 {
    public static void main(String args[])
    {
        int numberOfLines, c, k, space=1;      
        numberOfLines = 5;
        space = numberOfLines-1;
        for(k=1; k<=numberOfLines; k++)
        {
            for(c=1; c<=space; c++)
            {
                System.out.print(" ");
            }
            space--;
            for(c=1; c<=(2*k-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for(k=1; k<=(numberOfLines-1); k++)
        {
            for(c=1; c<=space; c++)
            {
                System.out.print(" ");
            }
            space++;
            for(c=1; c<=(2*(numberOfLines-k)-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
      
    }
}