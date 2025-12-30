import java.util.HashMap;

public class Sum2 {
    public static void main(String[] args) {
        String sentence = "Akash is a good boy, No! Actually akash akash is the best boy";
        HashMap<String, Integer> mp = new HashMap<>();

        int res=0;
        String ans="";

        String[] parts = sentence.split(" ");
        for (int i = 0; i < parts.length; i++) {
            // if case sensitive
            // String part = parts[i];
            // if case insensitive
            String part = parts[i].toLowerCase();
            int currentFrequency = mp.getOrDefault(part, 0);
            mp.put(part, currentFrequency + 1);
            if (mp.get(part) > res) {
                res = mp.get(part);
                ans = part;
            }
        }

        System.out.println("Most frequent word is " + ans);
    }
}
