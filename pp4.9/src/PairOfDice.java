public class PairOfDice
{
   private Die die1;
   private Die die2;
  
   public PairOfDice()
   {
       die1 = new Die();
       die2 = new Die();
   }
  
   public void setDie1(int value)
   {
       die1.setFaceValue(value);
   }
  
   public void setDie2(int value)
   {
       die2.setFaceValue(value);
   }
  
   public int getDie1()
   {
       return die1.getFaceValue();
   }
  
   public int getDie2()
   {
       return die2.getFaceValue();
   }
  
   public void roll()
   {
       int val1 = die1.roll();
       int val2 = die2.roll();
       setDie1(val1);
       setDie2(val2);
   }
  
   public int sum()
   {
       return (getDie1() + getDie2());
   }
}