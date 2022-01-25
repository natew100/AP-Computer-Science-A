package averagingnumbers;

public class AveragingNumbers {
    public static void main(String[] args) {
       // check if length of args array is greater than 0
       if (args.length > 0)
       {
           // iterating the args array and printing each 
           for (String val:args)
               System.out.println(val);
       }
       else
           System.out.println( "No arguments");
   }
}