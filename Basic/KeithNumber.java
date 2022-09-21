import java.util.ArrayList;
import java.util.Scanner;

public class KeithNumber {

  static int getTotal(ArrayList < Integer > arr) {
    int total = 0;
    for (int i = 0; i < arr.size(); i++)
      total += arr.get(i);
    return total;
  }

  public static void main(String[] args) {
    ArrayList < Integer > arr = new ArrayList < > ();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any positive number: ");
    int inputNumber = sc.nextInt();
    int copy = inputNumber;
    int rem, count = 0;
    while (copy > 0) {
      rem = copy % 10;
      arr.add(count, rem);
      count++;
      copy /= 10;
    }
    int sum = getTotal(arr);
    System.out.print("Summations: ");
    while (sum <= inputNumber) {
      arr.remove(count - 1);
      arr.add(0, sum);
      if (sum == inputNumber)
        break;
      sum = getTotal(arr);
      System.out.print(sum + " ");
    }
    if (sum == inputNumber)
      System.out.println("\nKeith Number");
    else
      System.out.println("\nNot a Keith Number");
    sc.close();
  }
}
