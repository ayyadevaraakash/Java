import java.util.ArrayList;

public class RabinKarp {
    public static void rabinKarp(String text, String pattern, ArrayList<Integer> res) {
        int T = text.length(), P = pattern.length();
        int d = 256, H = 1, tHash = 0, pHash = 0, prime = 101;

        for (int i = 0; i < P - 1; i++) {
            H = (d * H) % prime;
        }

        for (int i = 0; i < P; i++) {
            tHash = (d * tHash + text.charAt(i)) % prime;
            pHash = (d * pHash + pattern.charAt(i)) % prime;
        }

        for (int i = 0, j = 0; i <= T - P; i++) {
            if (tHash == pHash) {
                for (j = 0; j < P; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }
                if (j == P) {
                    res.add(i);
                }
            }
            if (i < T - P) {
                tHash = (d * (tHash - text.charAt(i) * H) + text.charAt(i + P)) % prime;
                if (tHash < 0) {
                    tHash += prime;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        String text = "abababab";
        String pattern = "aba";

        rabinKarp(text, pattern, res);

        System.out.println("Pattern found at index: " + res);
    }
}
