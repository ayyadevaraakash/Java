import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any year: ");
    int enteredYear = sc.nextInt();
    if (enteredYear % 400 == 0 || (enteredYear % 4 == 0 && enteredYear % 100 != 0))
      System.out.print("It's a leap year");
    else
      System.out.print("It's not a leap year");
    sc.close();
  }
}

// Logic notes

// Condition 1:
// If a number is divisible by 400 then it's a leap year

// Condition 2:
// If a number is divisible by 4 but at the same time it should not be divisible
// by 100

// then it's a leap year

// Why such strange conditions: Go and do some good research.
