class Spark {
    public static void main(String[] args) {
        int n = 4;
        // upper half
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++)
                System.out.print(" ");
            for (int j = 0; j < n - i; j++)
                System.out.print("* ");
            System.out.println();
        }
        // lower half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int k = 0; k <= i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
