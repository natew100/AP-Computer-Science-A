package pp7.pkg3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Driver{
   public static void main(String[] args) {
       Address school = new Address("123 east drive","cherry hill","NJ",523474);
       Address jHome = new Address("154 ball street","new york","NY",24234);
       Student john = new Student("jon","smith",jHome,school,80,90,95);
       Address bHome = new Address("158 random street","new york","NY",24234);
       Student bill = new Student("Bill","Rose",jHome,school,86,91,78);
       Course apCsp = new Course("AP Computer Science");
       apCsp.addStudent(john);
       apCsp.addStudent(bill);
       apCsp.roll();
       System.out.println("AP Computer Science Test Average: "+apCsp.average());
   }
}