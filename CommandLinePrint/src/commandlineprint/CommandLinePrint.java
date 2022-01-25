package commandlineprint;

public class CommandLinePrint {
    public static void main(String[] args) {
        {
          if(args.length==0)
          {
              System.out.println("No Arguments");
          }   
          else
          {
              System.out.println(args[0]);
              System.out.println(args[1]);
          }
     }
  }
}