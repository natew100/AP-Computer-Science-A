package pp7.pkg1;

public class Transactions {
    public static void main (String[] args) {
        // pass in params
        Account acct1 = new Account ("Nate Wolf", 72354, 102.56);
        Account acct2 = new Account ("Bill Gates", 69713, 40.00);
        Account acct3 = new Account ("Tod Smith", 93757);
        
        // deposit method
        acct1.deposit (25.85);

        double gaatesBalance = acct2.deposit (500.00);
        System.out.println ("Gate's balance after deposit: " + gaatesBalance);
        System.out.println ("Gate's balance after withdrawal: " + acct2.withdraw (430.75, 1.50));

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println ();
        System.out.println (acct1);
        System.out.println (acct2);
        System.out.println (acct3);
    }
}