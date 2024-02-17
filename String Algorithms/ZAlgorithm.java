import java.util.ArrayList;

public class ZAlgorithm {
    public static void z(String str, int[] zValues) {
        int l = 0, r = 0;
        for (int k = 1; k < zValues.length; k++) {
            if (k > r) {
                l = k;
                r = k;
                while (r < zValues.length && str.charAt(r) == str.charAt(r - l)) {
                    r++;
                }
                zValues[k] = r - l;
                r--;
            } else {
                int k1 = k - l;
                if (zValues[k1] < r - k + 1) {
                    zValues[k] = zValues[k1];
                } else {
                    l = k;
                    while (r < zValues.length && str.charAt(r) == str.charAt(r - l)) {
                        r++;
                    }
                    zValues[k] = r - l;
                    r--;
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();

        String text = "abababab";
        String pattern = "aba";

        int P = pattern.length();

        String str = pattern + "$" + text;
        int n = str.length();

        int[] zValues = new int[n];

        z(str, zValues);

        for (int i = 0; i < n; i++) {
            if (zValues[i] == P) {
                res.add(i - P - 1);
            }
        }

        System.out.println(res);
    }
}
