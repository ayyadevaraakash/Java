// Problem: Given a string s1 and a string s2, write a program to check whether s2 is a rotation of s1.

/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

public class StringRotateCheck {
  public static void main(String[] args) {
    String string1 = "ABCD";
    String string2 = "CDAB";
    boolean flag = false;

    String concatBoth = string1 + string2;

    if (concatBoth.contains(string2))
      flag = true;

    if (flag)
      System.out.println("One string is a rotation of other");
    else
      System.out.println("Not a rotation");

  }
}
