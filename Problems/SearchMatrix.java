// Problem: https://leetcode.com/problems/search-a-2d-matrix/

public class SearchMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 3, 5, 7 },
        { 10, 11, 16, 20 },
        { 23, 30, 34, 60 }
    };

    int target = 16;
    int numberOfColumns = matrix[0].length;
    int targetRow = 0;
    boolean flag = false;

    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][numberOfColumns - 1] >= target) {
        targetRow = i;
        break;
      }
    }

    for (int i = 0; i < matrix[0].length; i++) {
      if (matrix[targetRow][i] == target) {
        flag = true;
        break;
      }
    }

    System.out.println("Element is present: " + flag);

  }
}
