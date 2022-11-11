import java.util.Arrays;

// Problem: https://www.codingninjas.com/codestudio/problems/shuffle-two-strings_1115692?topList=love-babbar-dsa-sheet-problems&utm_source=website&utm_medium=affiliate&utm_campaign=450dsatracker

public class ValidShuffle {

  static boolean checkValidShuffle(String t1, String t2, String test) {
    int length1 = t1.length();
    int length2 = t2.length();
    int resultLength = test.length();

    char[] temp = t1.toCharArray();
    Arrays.sort(temp);
    t1 = temp.toString();

    if (length1 + length2 == resultLength) {

      return true;
    } else
      return false;
  }

  public static void main(String[] args) {
    String text1 = "XYZ";
    String text2 = "123";
    String shuffleText = "X12Y3Z";

    if (checkValidShuffle(text1, text2, shuffleText))
      System.out.println("Valid Shuffle");
    else
      System.out.println("Not a valid shuffle");
  }
}
