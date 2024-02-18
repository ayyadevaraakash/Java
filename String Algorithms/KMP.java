import java.util.ArrayList;

public class KMP {
    public static void calculateLPS(String pattern, int[] LPS, int P) {
        int idx = 0, i = 1;
        while (i < P) {
            if (pattern.charAt(idx) == pattern.charAt(i)) {
                LPS[i] = idx + 1;
                idx++;
                i++;
            } else {
                if (idx != 0) {
                    idx = LPS[idx - 1];
                } else {
                    i++;
                }
            }
        }
    }

    public static void knuthMorrisPratt(String text, String pattern, ArrayList<Integer> res) {
        int T = text.length(), P = pattern.length();
        int[] LPS = new int[P];

        calculateLPS(pattern, LPS, P);

        int i = 0, j = 0;
        while (i < T) {
            if (j < P && text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == P) {
                    res.add(i - P);
                }
                if (j != 0) {
                    j = LPS[j - 1];
                } else {
                    i++;
                }
            }
        }

        if (j == P) {
            res.add(i - P);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        String text = "abababab";
        String pattern = "aba";

        knuthMorrisPratt(text, pattern, res);

        System.out.println("Pattern found at index: " + res);
    }
}
