// Problem: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/?amp=1
// Question Number 15

class InvertRightAlpha {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      int alphabet = 65;
      for (int j = 0; j < n - i; j++, alphabet++) {
        System.out.print((char) alphabet);
      }
      System.out.println();
    }
  }
}
