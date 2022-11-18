class MobileKeypad {
  public static void main(String[] args) {
    String str[] = { "2", "22", "222", "3", "33", "333",
        "4", "44", "444", "5", "55", "555",
        "6", "66", "666", "7", "77", "777",
        "7777", "8", "88", "888", "9", "99",
        "999", "9999" };

    String inputText = "AADITYA AKASH AMAN";
    int length = inputText.length();

    for (int i = 0; i < length; i++) {
      if (inputText.charAt(i) != ' ')
        System.out.print(str[inputText.charAt(i) - 'A']);
    }
  }
}
