package pp9.pkg1;

    public class Pp91 {
        public static void main(String[] args) {
            MonetaryCoin penny = new MonetaryCoin(1);
            MonetaryCoin nickel = new MonetaryCoin(5);
            MonetaryCoin dime = new MonetaryCoin(10); 
            MonetaryCoin quarter = new MonetaryCoin(25);

            System.out.println("Value of penny is " + penny.getValue());
            System.out.println("Value of nickel is " + nickel.getValue());
            System.out.println("Value of dime is " + dime.getValue());
            System.out.println("Value of quarter is " + quarter.getValue());

            //demonstrate that moneytary coin can be flipped
            System.out.println("nickel is now " + nickel);
            nickel.flip();
            System.out.println("nickel is now " + nickel);

            int sum = nickel.getValue() + quarter.getValue();
            System.out.println("Sum of nickel and quarter is " + sum);
    }
}
