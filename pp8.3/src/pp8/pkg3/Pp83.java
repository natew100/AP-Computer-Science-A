package pp8.pkg3;
import java.io.*;  
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pp83 {

    public static void main(String[] args) throws FileNotFoundException {
    //array declared
    int[] data = new int[100];
    Scanner sc = new Scanner(System.in);
    int index = 0;
    /*Reading file*/
    File file=new File("C:\\Users\\Nate.DESKTOP-PL52Q7Q\\Desktop\\AP-Computer-Science-A\\pp8.3\\src\\pp8\\pkg3\\num_file");
    Scanner inputFile = new Scanner(file);
    try {
        while (inputFile.hasNext()) {
            if (inputFile.hasNextInt()) {
                // store numbers in array
                data[index] = inputFile.nextInt();
                index++;
            } 
            else {
                inputFile.next();
            }
        }
    } 
    finally {
        inputFile.close();
    }

    String[] printStars = {" 1-10 |", "11- 20 | ", "21- 30 | ", "31- 40 | ", "41- 50 | ", "51- 60 | ", "61- 70 | ", "71- 80 | ", "81- 90 | ", "91-100 | "};
    // loop through values
    for (int i = 0; i < index; i++) {
        int num = data[i];
        if (num < 11) {
        printStars[0] += "*";
        } else if (num < 21) {
        printStars[1] += "*";
        } else if (num < 31) {
        printStars[2] += "*";
        } else if (num < 41) {
        printStars[3] += "*";
        } else if (num < 51) {
        printStars[4] += "*";
        } else if (num < 61) {
        printStars[5] += "*";
        } else if (num < 71) {
        printStars[6] += "*";
        } else if (num < 81) {
        printStars[7] += "*";
        } else if (num < 91) {
        printStars[8] += "*";
        } else {
        printStars[9] += "*";
        }
    }
    for (int i = 0; i < 10; i++) {
        System.out.println(printStars[i]);
    }
  }
}