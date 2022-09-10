public class HollowReversedTriangle {
    public static void main(String[] args) {
        int i, j, k, n = 8;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < n - i; k++) {
                if (k == 0 || k == n - i - 1 || i == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
