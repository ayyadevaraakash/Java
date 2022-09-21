import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int enteredValue, copyOfEnteredValue, remainder, power = 0, sum = 0;
    System.out.print("Enter any number: ");
    enteredValue = sc.nextInt();
    copyOfEnteredValue = enteredValue;

    // calculating length of number
    while (enteredValue > 0) {
      power++;
      enteredValue /= 10;
    }

    // cause enteredValue got changed
    enteredValue = copyOfEnteredValue;

    while (enteredValue > 0) {
      remainder = enteredValue % 10;
      sum += Math.pow(remainder, power);
      enteredValue /= 10;
    }

    System.out.println("Entered Value: " + copyOfEnteredValue);
    System.out.println("Armstrong Sum: " + sum);

    if (copyOfEnteredValue == sum)
      System.out.println("Armstrong Number");
    else
      System.out.println("Not an Armstrong Number");

    sc.close();

  }
}
