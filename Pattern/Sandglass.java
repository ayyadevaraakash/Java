public class Sandglass {
    public static void main(String[] args) {
        int i, j, k, n = 5;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
