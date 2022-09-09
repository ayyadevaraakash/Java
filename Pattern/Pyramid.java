class Pyramid {
    public static void main(String[] args) {
        int i, j, k, n = 5;
        for (i = 0; i < n; i++) {
            for (k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
