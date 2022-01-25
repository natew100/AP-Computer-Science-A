/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp9.pkg7;



public class Pp97 {
    public static void main(String[] args) {
        Computers computers=new Computers(50,2300, 2500, "Dell");
        CellPhones cellphones=new CellPhones(2,600, 250, "Apple");
        Pagers pagers=new Pagers(2,100, 250, "Nexus");
        DigitalCameras digitalCameras=new DigitalCameras(8, 260, 2000, "Sony");
        System.out.println(digitalCameras.toString());
        System.out.println(pagers.toString());
        System.out.println(cellphones.toString());
        System.out.println(computers.toString());   
    }
}