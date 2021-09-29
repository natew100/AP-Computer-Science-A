package pp24;
import java.util.Scanner;

public class Pp24 {
    public static void main(String[] args) {
        String name, age, college, petName;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Enter Your Name: ");
        name = scan.nextLine();
        System.out.print ("Enter Your Age: ");
        age = scan.nextLine();
        System.out.print ("Enter Your College: ");
        college = scan.nextLine();
        System.out.print ("Enter Your Pet's Name: ");
        petName = scan.nextLine();
        System.out.println("Hello my name is " + name + " and I am " + age + 
                " years" + "\n" + "old. I'm enjoing my time at " + college 
                + ", though" + "\n" + "I miss my pet " + petName + " very much!");
    }
}
