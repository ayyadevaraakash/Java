import java.util.Scanner;

public class PalindromeString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String enteredText, reversedText;
    System.out.print("Enter some text: ");
    enteredText = sc.nextLine();
    reversedText = "";
    int lengthOfEnteredText = enteredText.length();
    for (int i = 0; i < lengthOfEnteredText; i++) {
      reversedText += enteredText.charAt(lengthOfEnteredText - i - 1);
    }
    System.out.println("Entered Text: " + enteredText);
    System.out.println("Reversed Text: " + reversedText);
    if (enteredText.equals(reversedText))
      System.out.println("Palindrome");
    else
      System.out.println("Not a Palindrome");
    sc.close();
  }
}
