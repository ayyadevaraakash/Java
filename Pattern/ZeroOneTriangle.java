public class ZeroOneTriangle {
  public static void main(String[] args) {
    int n = 6;
    for (int i = 0; i < n; i++) {
      int temp = 1;
      for (int j = 0; j < i; j++) {
        System.out.print(temp);
        temp = (temp == 1) ? 0 : 1;
      }
      System.out.println();
    }
  }
}
