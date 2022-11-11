import java.util.HashMap;

// Problem: https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/

class DuplicateCharString {
  public static void main(String[] args) {
    String inputSentence = "Aman is a talented guy, yet not hardworking";
    HashMap<Character, Integer> occurrence = new HashMap<>();

    for (int i = 0; i < inputSentence.length(); i++) {
      if (inputSentence.charAt(i) != ' ') {
        if (occurrence.containsKey(inputSentence.charAt(i)))
          occurrence.put(inputSentence.charAt(i), occurrence.get(inputSentence.charAt(i)) + 1);
        else
          occurrence.put(inputSentence.charAt(i), 1);
      }
    }
    occurrence.forEach((alphabet, frequency) -> {
      if (frequency > 1)
        System.out.println(alphabet + " occurred " + frequency + " times");
    });
  }
}
