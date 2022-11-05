// Problem: Given an integer x and an integer n, calculate x raised to power n. Basically Implement pow(x, n).
// Time Complexity: O(log n), Space Complexity: O(1)
// Simple looping not expected

public class PowerProblem {
  public static void main(String[] args) {
    int x = 4, n = 3, answer = 1;
    int copyOfNumber = x;
    int copyOfPower = n;

    while (copyOfPower > 0) {
      if (copyOfPower % 2 == 0) {
        x *= x;
        copyOfPower /= 2;
      } else {
        answer *= x;
        copyOfPower--;
      }
    }

    System.out.println(copyOfNumber + " to the power " + n + " is " + answer);

  }
}
