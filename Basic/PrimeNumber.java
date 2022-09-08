import java.util.Scanner;
import java.lang.Math;

class PrimeNumber {

  static boolean checkPrime(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int inputNumber = sc.nextInt();
    boolean isPrime = checkPrime(inputNumber);
    if (isPrime)
      System.out.println("Prime number");
    else
      System.out.println("Not a prime number");
    sc.close();
  }
}
