import java.util.Scanner;

class PrimeInRange {

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
    int lowerLimit, upperLimit;
    boolean isPrime;
    System.out.print("Enter lower limit: ");
    lowerLimit = sc.nextInt();
    System.out.print("Enter upper limit: ");
    upperLimit = sc.nextInt();
    while (lowerLimit <= upperLimit) {
      isPrime = checkPrime(lowerLimit);
      if (isPrime)
        System.out.print(lowerLimit + " ");
      lowerLimit++;
    }
    sc.close();
  }
}
