// Problem: Find the first repeated word in a string

import java.util.HashMap;

public class FirstRepeated {
    public static void main(String[] args) {
        String sentence = "Ravi had been saying that he had been there";
        String[] sample = sentence.split(" ");
        HashMap<String, Integer> occurrence = new HashMap<>();

        for (int i = 0; i < sample.length; i++) {
            if (occurrence.containsKey(sample[i]))
                occurrence.put(sample[i], occurrence.get(sample[i]) + 1);
            else
                occurrence.put(sample[i], 1);
        }

        for (String i : sample)
            if (occurrence.get(i) > 1) {
                System.out.println("\"" + i + "\" repeated more than once");
                break;
            }
    }
}
