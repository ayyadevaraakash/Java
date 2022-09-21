import java.util.Scanner;

public class PerfectNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNumber, sumOfDivisors = 0;
    System.out.print("Enter any positive number: ");
    inputNumber = sc.nextInt();
    System.out.print("Divisors are: ");
    for (int i = 1; i < inputNumber; i++) {
      if (inputNumber % i == 0) {
        sumOfDivisors += i;
        System.out.print(i + " ");
      }
    }
    System.out.println("\nEntered Number: " + inputNumber);
    System.out.println("Sum of its divisors: " + sumOfDivisors);
    if (inputNumber == sumOfDivisors)
      System.out.println("Perfect Number");
    else
      System.out.println("Not a Perfect Number");
    sc.close();
  }
}
