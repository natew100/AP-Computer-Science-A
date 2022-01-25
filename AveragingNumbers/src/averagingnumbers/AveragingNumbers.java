package averagingnumbers;

public class AveragingNumbers {
    public static void main(String[] args) {
        double total = 0;
       // check if length of args array is greater than 0
       if (args.length > 0)
       {
           // iterating the args array and printing each 
           for(int i=0; i<args.length; i++) {
                total += Double.parseDouble(args[i]);
              }
           System.out.println(total/args.length);
       }
       else
           System.out.println("No arguments");
   }
}