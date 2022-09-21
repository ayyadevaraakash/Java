import java.util.Scanner;

public class EvilNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputNumber;
    String binaryEquivalent;
    System.out.print("Enter any positive number: ");
    inputNumber = sc.nextInt();
    binaryEquivalent = Integer.toBinaryString(inputNumber);
    System.out.println("Binary form: " + binaryEquivalent);
    int counter = 0;
    for (int i = 0; i < binaryEquivalent.length(); i++) {
      if (binaryEquivalent.charAt(i) == '1')
        counter++;
    }
    if (counter % 2 == 0)
      System.out.println("Evil Number");
    else
      System.out.println("Not an Evil Number");
    sc.close();
  }
}
