// Addition of two matrices. Difference can be obtained by changing + sign with a - on line 33

import java.util.Scanner;

public class Matrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows, columns;
    System.out.print("Enter number of rows: ");
    rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    columns = sc.nextInt();
    int[][] matrixA = new int[rows][columns];
    int[][] matrixB = new int[rows][columns];
    System.out.println("--------------------------------");
    System.out.println("Enter elements of matrix A: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrixA[i][j] = sc.nextInt();
      }
    }
    System.out.println("--------------------------------");
    System.out.println("Enter elements of matrix B: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        matrixB[i][j] = sc.nextInt();
      }
    }
    System.out.println("--------------------------------");
    System.out.println("A + B: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print((matrixA[i][j] + matrixB[i][j]) + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
