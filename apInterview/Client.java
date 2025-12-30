// FIND MOST FREQUENTLY OCCURRING CHARACTER IN A STRING

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        String sentence = "AkashisanicebutokAkashisgood";
        Map<Character, Integer> mp = new HashMap<>();
        int res=0;
        char ans='-';
        for (int i = 0; i < sentence.length(); i++) {
            // If Case sensitive
            // char currentChar = sentence.charAt(i);
            // If not case sensitive (we will convert everyone to lower case)
            char currentChar = Character.toLowerCase(sentence.charAt(i));
            int currentFrequency = mp.getOrDefault(currentChar, 0);
            mp.put(currentChar, currentFrequency + 1);
            if (mp.get(currentChar) > res) {
                res = mp.get(currentChar);
                ans=currentChar;
            }
        }
        System.out.println(ans + " with frequency " + res);
    }
}
