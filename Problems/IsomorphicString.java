// Problem: https://practice.geeksforgeeks.org/problems/isomorphic-strings/0

import java.util.HashMap;

class IsomorphicString {
  public static void main(String[] args) {
    String str1 = "aab";
    String str2 = "xxy";
    int length = str1.length();
    HashMap<Character, Character> mapper = new HashMap<>();
    boolean flag = true;

    for (int i = 0; i < length; i++) {
      if (!mapper.containsKey(str1.charAt(i))) {
        mapper.put(str1.charAt(i), str2.charAt(i));
      } else {
        if (!(mapper.get(str1.charAt(i)) == str2.charAt(i))) {
          flag = false;
          break;
        }
      }
    }
    System.out.println("Isomorphic: " + flag);
  }
}
