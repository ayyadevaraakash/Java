class MatrixMax1 {
  public static void main(String[] args) {
    int[][] matrix = {
        { 0, 0 },
        { 0, 1 },
        { 0, 0 },
        { 0, 0 },
        { 0, 1 },
        { 0, 1 }
    };

    int currColumn = 0;
    int currRow = 0;
    int rowWithMax = 0;
    boolean flag = true;

    while (currRow < matrix.length) {
      if (matrix[currRow][currColumn] == 1) {
        rowWithMax = currRow;
        flag = false;
      }
      if (!flag)
        break;
      else if (currRow == matrix.length - 1) {
        currColumn++;
        if (currColumn > matrix[0].length - 1)
          break;
        currRow = 0;
      } else
        currRow++;
    }

    System.out.println("Row with max 1's: " + rowWithMax);

  }
}

// Logic Notes
/*
 * Check for the first row with first occurrence of one since it's a sorted
 * array.
 * Refer code for basic manipulation.
 */
