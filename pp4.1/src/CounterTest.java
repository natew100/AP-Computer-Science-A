public class CounterTest

{
    public static void main(String[] args)
    {
        Counter ShopCounter = new Counter();
        Counter SportsCounter = new Counter();
        System.out.println("Initial Shop count: " + ShopCounter);
        System.out.println("Initial Sports count: " + SportsCounter);
        ShopCounter.click();
        ShopCounter.click();
        ShopCounter.click();
        SportsCounter.click();
        System.out.println();
        System.out.println("Shop Count: " + ShopCounter);
        System.out.println("Sport Count: " + SportsCounter);       
        System.out.println();
        int combination = ShopCounter.getCount() + SportsCounter.getCount();
        System.out.println("Grand Total: " + combination);
        ShopCounter.reset();
        System.out.println("Shop count after reset: " + ShopCounter);
    }
}