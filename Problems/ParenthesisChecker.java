public class ParenthesisChecker {
  public static void main(String[] args) {
    String input = "([{}])";
    boolean flag;
    int compareLength = Integer.MAX_VALUE;

    while (input.length() < compareLength) {
      compareLength = input.length();
      input = input.replace("()", "");
      input = input.replace("[]", "");
      input = input.replace("{}", "");
    }

    if (input.length() == 0) {
      flag = true;
    } else {
      flag = false;
    }

    if (flag)
      System.out.println("Balanced Parenthesis");
    else
      System.out.println("Unbalanced Parenthesis");

  }
}
