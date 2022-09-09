public class LeftPascal {
    public static void main(String[] args) {
        int i, j, k, n = 5;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j <= i + 1; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < n - 1 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
