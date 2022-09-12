class DiamondNumber {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      int temp1 = i + 1;
      int temp2 = 2;
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print(temp1--);
      }
      for (int k = 0; k < i; k++) {
        System.out.print(temp2++);
      }
      System.out.println();
    }
    for (int i = 0; i < n; i++) {
      int temp1 = n - i - 1;
      int temp2 = 2;
      for (int j = 0; j <= i + 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < n - i - 1; k++) {
        System.out.print(temp1--);
      }
      for (int k = 0; k < n - i - 2; k++) {
        System.out.print(temp2++);
      }
      System.out.println();
    }
  }
}
