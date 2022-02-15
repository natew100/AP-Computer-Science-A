/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp10.pkg2;

/**
 *
 * @author Administrator
 */
public class Employee extends StaffMember
{
   protected String socialSecurityNumber;
   protected double payRate;
   public Employee (String eName, String eAddress, String ePhone,String socSecNumber, double rate)
   {
       super (eName, eAddress, ePhone);

       socialSecurityNumber = socSecNumber;
       payRate = rate;
   }
   public String toString()
   {
       String result = super.toString();

       result += "\nSocial Security Number: " + socialSecurityNumber;

       return result;
   }

   public double pay()
   {
       return payRate;
   }

   /*Override getVacationDays method*/
   public double getVacationDays() {
       return payRate;
   }
}
