import java.util.Arrays;
import java.util.HashMap;

class MobileKeypad {
  public static void main(String[] args) {
    HashMap<String, Character> keypad = new HashMap<>();
    keypad.put("ABC", '2');
    keypad.put("DEF", '3');
    keypad.put("GHI", '4');
    keypad.put("JKL", '5');
    keypad.put("MNO", '6');
    keypad.put("PQRS", '7');
    keypad.put("TUV", '8');
    keypad.put("WXYZ", '9');

    char[] sameCharacters = { '1', '0', '*', '#', ' ' };
    String inputSentence = "HELLO WORLD";
    int length = inputSentence.length();

    for (int i = 0; i < length; i++) {
      if (Arrays.binarySearch(sameCharacters, inputSentence.charAt(i)) >= 0)
        System.out.print(inputSentence.charAt(i));
      else {
        int copy = i;
        keypad.forEach((k, v) -> {
          if (k.contains(String.valueOf(inputSentence.charAt(copy)))) {
            System.out.print(v);
          }
        });
      }
    }
  }
}
