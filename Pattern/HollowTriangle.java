class HollowTriangle {
  public static void main(String[] args) {
    int i, j, k, n = 9;
    for (i = 0; i < n; i++) {
      for (j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (k = 0; k < i; k++) {
        if (k == 0 || k == i - 1 || i == n - 1)
          System.out.print("* ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}
