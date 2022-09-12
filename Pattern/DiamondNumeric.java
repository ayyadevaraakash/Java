public class DiamondNumeric {
  public static void main(String[] args) {
    int n = 6;
    for (int i = 0; i < n; i++) {
      int temp = i + 1;
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < n - i; k++) {
        System.out.print(temp++ + " ");
      }
      System.out.println();
    }
    for (int i = 1; i < n; i++) {
      int temp = n - i;
      for (int j = 0; j < n - 1 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print(temp++ + " ");
      }
      System.out.println();
    }
  }
}
