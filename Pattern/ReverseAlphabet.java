// Problem: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/?amp=1
// Question Number 18

class ReverseAlphabet {
  public static void main(String[] args) {
    int n = 5;
    int alphabet = 65;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((char) (alphabet + 4 - i + j) + " ");
      }
      System.out.println();
    }
  }
}
