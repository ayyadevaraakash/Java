// Problem: https://www.codingninjas.com/codestudio/problems/shuffle-two-strings_1115692?topList=love-babbar-dsa-sheet-problems&utm_source=website&utm_medium=affiliate&utm_campaign=450dsatracker

import java.util.Arrays;

public class ValidShuffle {

  static String sortedStringMaker(String s1) {
    char[] temp = s1.toCharArray();
    Arrays.toString(temp);
    return new String(temp);
  }

  static boolean checkValidShuffle(String t1, String t2, String test) {
    int length1 = t1.length();
    int length2 = t2.length();
    int resultLength = test.length();

    if (length1 + length2 != resultLength)
      return false;

    String sortedString1 = sortedStringMaker(t1);
    String sortedString2 = sortedStringMaker(t2);
    String sortedResult = sortedStringMaker(test);

    int i = 0, j = 0, k = 0;

    while (k < resultLength) {
      if (i < length1 && sortedString1.charAt(i) == sortedResult.charAt(k))
        i++;
      else if (j < length2 && sortedString2.charAt(j) == sortedResult.charAt(k))
        j++;
      k++;
    }

    if (i == length1 && j == length2 && k == resultLength)
      return true;
    else
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
