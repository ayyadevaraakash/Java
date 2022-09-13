public class DiamondAlphabet {
  public static void main(String args[]) {
    int n = 6;
    char ch = 65;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        if (k == 0 || k == i)
          System.out.print(ch + " ");
        else
          System.out.print("  ");
      }
      ch++;
      System.out.println();
    }
    ch--;
    for (int i = 0; i < n - 1; i++) {
      ch--;
      for (int j = 0; j <= i + 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < n - i - 1; k++) {
        if (k == 0 || k == n - i - 2)
          System.out.print(ch + " ");
        else
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}
