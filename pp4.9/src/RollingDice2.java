public class RollingDice2
{
   public static void main(String args[])
   {
       PairOfDice dice = new PairOfDice();
       dice.roll();
       System.out.println("Die 1 Outcome: " + dice.getDie1());
       System.out.println("Die 2 Outcome: " + dice.getDie2());
       System.out.println("Sum of two die values: " + dice.sum());
   }
}