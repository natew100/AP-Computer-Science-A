package pp5.pkg13;
import java.util.Scanner;
import java.io.*;

public class Pp513 {
    public static void main(String args[]) {

        try {
            // init scanner for files
            Scanner fileScan1 = new Scanner(new File("C:\\Users\\3009496\\Desktop\\AP-Computer-Science-A\\pp5.13\\src\\pp5\\pkg13\\file1"));
            Scanner fileScan2 = new Scanner(new File("C:\\Users\\3009496\\Desktop\\AP-Computer-Science-A\\pp5.13\\src\\pp5\\pkg13\\file2"));
            while (fileScan1.hasNext() && fileScan2.hasNext()) {
                // while loop to scan each line
                String file1Lines = fileScan1.nextLine();
                String file2Lines = fileScan2.nextLine();    
                if (!file1Lines.equals(file2Lines)) {
                    System.out.println("File 1: " + file1Lines);
                    System.out.println("File 2: " + file2Lines);
                }
            }
        } catch (Exception e) {
            System.out.println("File not found : " + e.getMessage());
        }
    }
}