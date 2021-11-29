package pp5.pkg13;
import java.util.Scanner;
import java.io.*;

public class Pp513 {
    public static void main(String args[]) {

        try {
            Scanner file1 = new Scanner(new File("file1.txt"));
            Scanner file2 = new Scanner(new File("file2.txt"));
            int line = 0, flag = 0;
            while (true) {
                String line1 = "", line2 = "";
                if (file1.hasNextLine()) {
                    line1 = file1.nextLine();
                    flag++;

                }

                if (file2.hasNextLine()) {
                    line2 = file2.nextLine();
                    flag++;

                }

                line++;

                if (!line1.equals(line2)) {
                    System.out.println("Line " + line + " is different.");

                }
                if (flag == 0)
                    break;
            }

        } catch (Exception e) {

            System.out.println("File not found : " + e.getMessage());

        }
    }
}