public class Subsequence {
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "padshecbb";
        int i = 0, j = 0;

        while (j != string2.length()) {
            if (string1.charAt(i) == string2.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }

            if (i == string1.length())
                break;
        }

        if (i == string1.length())
            System.out.println("Subsequence found");
        else
            System.out.println("Subsequence not found");

    }
}
