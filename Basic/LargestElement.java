import java.util.Scanner;

public class LargestElement {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter number of elements: ");
      int i;
      int numberOfElements = sc.nextInt();
      int[] myArray = new int[numberOfElements];
      // take input
      System.out.print("Enter elements: ");
      for (i = 0; i < numberOfElements; i++) {
        myArray[i] = sc.nextInt();
      }
      // logic
      int max = myArray[0];
      for (i = 1; i < numberOfElements; i++) {
        max = (max > myArray[i]) ? max : myArray[i];
      }
      System.out.print("Max Element: " + max);
      sc.close();
    }
  }
}
