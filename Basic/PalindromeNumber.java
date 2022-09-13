import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int remainder, enteredNumber, reversedNumber = 0;
    System.out.print("Enter any number: ");
    enteredNumber = sc.nextInt();
    int copyOfEnteredNumber = enteredNumber;
    while (enteredNumber > 0) {
      remainder = enteredNumber % 10;
      reversedNumber = reversedNumber * 10 + remainder;
      enteredNumber = enteredNumber / 10;
    }
    System.out.println("Original Number: " + copyOfEnteredNumber);
    System.out.println("Reversed Number: " + reversedNumber);
    if (copyOfEnteredNumber == reversedNumber)
      System.out.print("Palindrome Number");
    else
      System.out.println("Not a Palindrome Number");
    sc.close();
  }
}
