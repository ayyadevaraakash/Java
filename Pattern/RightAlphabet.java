public class RightAlphabet {
  public static void main(String[] args) {
    int n = 8;
    for (int i = 0; i < n; i++) {
      char ch = 65;
      for (int j = 0; j < i; j++) {
        System.out.print(ch++ + " ");
      }
      System.out.println();
    }
  }
}
