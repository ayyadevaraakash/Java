import java.util.Scanner;

public class LargestElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int numberOfElements = sc.nextInt();
    int[] myArray = new int[numberOfElements];
    // take input
    System.out.print("Enter elements: ");
    for (int i = 0; i < numberOfElements; i++) {
      myArray[i] = sc.nextInt();
    }
    // logic
    int max = myArray[0];
    for (int i = 1; i < numberOfElements; i++) {
      max = (max > myArray[i]) ? max : myArray[i];
    }
    System.out.print("Max Element: " + max);
    sc.close();
  }
}
