public class NumberPattern {
    public static void main(String[] args) {
        int i, j, n = 4, counter = 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print((counter++) + " ");
            }
            System.out.println();
        }
    }
}
