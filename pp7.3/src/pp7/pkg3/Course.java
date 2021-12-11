/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp7.pkg3;

import java.util.ArrayList;
public class Course{
   private String name;
   ArrayList<Student> students = new ArrayList<Student>();

   public Course(String name){
       this.name = name;
   }

   public double average(){
       double total = 0.00;
       double average = 0.00;
       for(Student student : students){
           total += student.average();
       }
       average = total / students.size();
       return average;
   }
   public void roll(){
       System.out.println("Course: "+ name);
       System.out.print("Student: ");
       for(Student student : students){
           System.out.print(student.toString());
       }
   }

   public void addStudent(Student student){
       students.add(student);
   }
}