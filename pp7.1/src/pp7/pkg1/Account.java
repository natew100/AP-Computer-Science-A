package pp7.pkg1;
import java.text.NumberFormat;



public class Account {
    private final double RATE = 0.035;
    private long acctNumber;
    private double balance;
    private String name;
    
    //init constructor 
    public Account(){
       this.name="";
       this.acctNumber=0;
       this.balance=0;
    }
    
    public Account(String name,long account){
       this.name=name;
       this.acctNumber=account;
       this.balance=0;
    }

    
    public Account (String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    // deposit method
    public double deposit (double amount) {
        balance = balance + amount;
        return balance;
    }

    
    // withdraw method
    public double withdraw (double amount, double fee) {
        balance = balance - amount - fee;
        return balance;
    }

    // add interest to balance method
    public double addInterest () {
        balance += (balance * RATE);
        return balance;
    }
    
    // return balance
    public double getBalance () {
        return balance;
    }

    // to string method
    public String toString () {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}