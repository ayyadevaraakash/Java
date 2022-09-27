import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1, row2, column1, column2;
        System.out.print("Enter number of rows in matrix A: ");
        row1 = sc.nextInt();
        System.out.print("Enter number of columns in matrix A: ");
        column1 = sc.nextInt();
        System.out.print("Enter number of rows in matrix B: ");
        row2 = sc.nextInt();
        System.out.print("Enter number of columns in matrix B: ");
        column2 = sc.nextInt();
        if (row2 != column1) {
            System.out.println("Matrix Multiplication is not possible");
        } else {
            int[][] matrixA = new int[row1][column1];
            int[][] matrixB = new int[row2][column2];
            int[][] multiplication = new int[row1][column2];
            System.out.println("Enter elements of matrix A:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    matrixA[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of matrix B:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    matrixB[i][j] = sc.nextInt();
                }
            }
            System.out.println("Matrix A X Matrix B:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < column1; k++) {
                        multiplication[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
            // Printing the final matrix
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print(multiplication[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
