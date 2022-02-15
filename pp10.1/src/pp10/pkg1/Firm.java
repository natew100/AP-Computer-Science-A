package pp10.pkg1;

 interface Payable {

   public void payday();
}

 class Staff implements Payable{
   public void payday() {
       System.out.println("it is payday");
   }
}

public class Firm
{
   //-----------------------------------------------------------------
   // Creates a staff of employees for a firm and pays them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Staff personnel = new Staff();

      personnel.payday();
   }
}