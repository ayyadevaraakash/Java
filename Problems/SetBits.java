// Problem: https://practice.geeksforgeeks.org/problems/set-bits0143/1

class SetBits {
  public static void main(String[] args) {
    int n = 7;
    int count = 0;

    while (n > 0) {
      n = n & n - 1;
      count++;
    }

    System.out.println("Number of set bits: " + count);
  }
}
