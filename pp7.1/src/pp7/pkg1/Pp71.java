/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp7.pkg1;
        import java.util.*;

/**
 *
 * @author Nate
 */
public class Pp71 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // init scanner
        int a, b;
        System.out.print("Enter First Value: ");
        a = input.nextInt();
        System.out.print("Enter Second Value: ");
        b = input.nextInt();
        // call average method with 2 ints passed
        System.out.println("The Average Is: "+average(a,b));
    }
    
    public static double average(int a,int b)
       {return (a+b)/2.0;
       }
}