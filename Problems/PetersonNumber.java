import java.util.Scanner;

class PetersonNumber {

  static int getFactorial(int x) {
    if (x == 0 || x == 1) {
      return 1;
    } else {
      return x * getFactorial(x - 1);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNumber, requiredSum = 0, copy;
    System.out.print("Enter any positive number: ");
    inputNumber = sc.nextInt();
    copy = inputNumber;
    while (inputNumber > 0) {
      int rem = inputNumber % 10;
      requiredSum += getFactorial(rem);
      inputNumber /= 10;
    }
    System.out.println("Sum of factorials of its digits: " + requiredSum);
    if (requiredSum == copy)
      System.out.println("Peterson Number");
    else
      System.out.println("Not a Peterson Number");
    sc.close();
  }
}
