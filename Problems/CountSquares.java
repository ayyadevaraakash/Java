public class CountSquares {
  public static void main(String[] args) {
    int n = 25;
    int count = 0;
    for (int i = 1; i < Math.sqrt(n); i++) {
      count++;
    }
    System.out.println(count);
  }
}
