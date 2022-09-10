public class PascalTriangle {

    static int calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    static int nChooseR(int n, int r) {
        return (calculateFactorial(n) / (calculateFactorial(n - r) * calculateFactorial(r)));
    }

    public static void main(String[] args) {
        int i, j, k, n = 5;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print(nChooseR(i, k) + " ");
            }
            System.out.println();
        }
    }
}
