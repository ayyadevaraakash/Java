import java.util.Scanner;

class MatrixRotation {

    static void printMatrix(int[][] arr, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotateMatrix(int[][] mat, int rowCount, int columnCount) {
        int m = 0, n = rowCount - 1;

        // Swapping Process (swap rows)
        for (int i = 0; i < rowCount / 2; i++) {
            for (int j = 0; j < columnCount; j++) {
                int temp = mat[m][j];
                mat[m][j] = mat[n][j];
                mat[n][j] = temp;
            }
            m++;
            n--;
        }

        // ith jth exchange with jth ith
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (i < j) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }

        // Printing after successful rotation
        System.out.println("After Rotation: ");
        printMatrix(mat, rowCount, columnCount);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        if (rows == columns) {
            int[][] matrix = new int[rows][columns];
            System.out.println("Enter the elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            rotateMatrix(matrix, rows, columns);
        } else {
            System.out.println("Only square matrix is allowed");
        }
        sc.close();
    }
}

// Logic

/*
 * line number 17 and 28 forms the logic. Initially we invert the matrix and
 * later perform flip operation to obtain the rotated matrix. Inverting can be
 * achieved from swapping rows, while flipping can be achieved by the replacing
 * operation.
 */
