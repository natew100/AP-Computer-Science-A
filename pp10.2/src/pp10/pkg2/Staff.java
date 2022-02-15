/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp10.pkg2;

/**
 *
 * @author Administrator
 */
public class Staff
{
   private StaffMember[] staffList;
   public Staff ()
   {
       staffList = new StaffMember[4];

       staffList[0] = new Executive ("Sam", "123 Main Line",
               "555-0469", "123-45-6789", 2423.07);
       staffList[1] = new Employee ("Carla", "456 Off Line",
               "555-0101", "987-65-4321", 1246.15);
       staffList[2] = new Employee ("Woody", "789 Off Rocker",
               "555-0000", "010-20-3040", 1169.23);
       staffList[3] = new Hourly ("Diane", "678 Fifth Ave.",
               "555-0690", "958-47-3625", 10.55);
   }

   //-----------------------------------------------------------------
   // Print all staff members including vacation days
   //-----------------------------------------------------------------
   public void payday ()
   {
       double amount;
       for (int count=0; count < staffList.length; count++)
       {  
           System.out.println(staffList[count]);
           amount = staffList[count].pay(); // polymorphic
           if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
           System.out.println ("-----------------------------------");
       }
   }
}