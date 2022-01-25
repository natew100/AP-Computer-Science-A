package squaretest;
import java.util.Scanner;
import java.io.*;

public class Square {

    int[][] square;

    public Square(int size) {
        square = new int[size][size];
    }

    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
        sum = sum + square[row][i];
        }
        return sum;
    }

    public int sumCol(int col) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
        sum = sum + square[i][col];
        }
        return sum;
    }

    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
        sum = sum + square[i][i];
        }
        return sum;
    }


    public int sumOtherDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
        sum = sum + square[square.length - i - 1][i];
        }
        return sum;
    }


    public boolean magic() {
        int d1 = sumMainDiag();
        int d2 = sumOtherDiag();
        if (d1 != d2) {
        return false;
        }
        for (int i = 0; i < square.length; i++) {
        if (d1 != sumRow(i) || d1 != sumCol(i)) {
        return false;
        }
        }
        return true;
    }


    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
        for (int col = 0; col < square.length; col++) {
        square[row][col] = scan.nextInt();
        }
        }
    }


    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
        for (int col = 0; col < square.length; col++) {
        System.out.print(square[row][col] + "\t");
        }
        System.out.println();
        }
    }
}