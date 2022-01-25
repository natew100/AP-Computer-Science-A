package pp9.pkg3;


public class Pp93 {
    public static void main(String[] args) {
        Novels novel=new Novels("Bob Jones","Test Novel", 250);
        Magazines magazine=new Magazines("Jon White","Test Magazine", 50);
        TechnicalJournals journal=new TechnicalJournals("Nate Wright","Test Techincal Journal", 75 );
        Textbooks textbook=new Textbooks("Peter Short","Test Text Book", 500);
        System.out.println(novel.toString());
        System.out.println(magazine.toString());
        System.out.println(journal.toString());
        System.out.println(textbook.toString());   
    }
}