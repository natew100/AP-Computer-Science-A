package pp9.pkg1;



public class MonetaryCoin extends Coin {
   private int value;
  
   //constructor to initialize a coin's value
   public MonetaryCoin(int val)
   {
       this.value = val;
   }
  
   //method to return the value of this coin
   public int getValue()
   {
       return value;
   }
  
  
}