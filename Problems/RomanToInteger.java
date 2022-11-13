// Problem: https://practice.geeksforgeeks.org/problems/roman-number-to-integer3201/1

import java.util.HashMap;

public class RomanToInteger {
  public static void main(String[] args) {
    HashMap<Character, Integer> correspondence = new HashMap<>();
    correspondence.put('I', 1);
    correspondence.put('V', 5);
    correspondence.put('X', 10);
    correspondence.put('L', 50);
    correspondence.put('C', 100);
    correspondence.put('D', 500);
    correspondence.put('M', 1000);

    String inputRoman = "VII";
    int length = inputRoman.length();
    int integerResult = 0;

    for (int i = length - 1; i >= 0; i--) {
      if (i < length - 1 && correspondence.get(inputRoman.charAt(i)) < correspondence.get(inputRoman.charAt(i + 1)))
        integerResult -= correspondence.get(inputRoman.charAt(i));
      else
        integerResult += correspondence.get(inputRoman.charAt(i));
    }
    System.out.println(inputRoman + ": " + integerResult);
  }
}
