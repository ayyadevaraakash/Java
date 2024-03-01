// Even though file name is square root but it covers nth root of a number m

public class SquareRoot {

    // Binary Exponentiation
    public static double multiply(double a, int b) {
        double res = 1.0;
        while (b > 0) {
            if (b % 2 == 0) {
                a = a * a;
                b /= 2;
            } else {
                res = res * a;
                b--;
            }
        }
        return res;
    }

    // Binary Search
    public static double f(double x, int n) {
        double epsilon = 1e-8;
        double low = 1;
        double high = x;

        double mid = (low + high) / 2.0;
        while (Math.abs(multiply(mid, n) - x) > epsilon) {
            if (multiply(mid, n) < x) {
                low = mid;
            } else {
                high = mid;
            }

            mid = (low + high) / 2.0;
        }

        return mid;
    }

    /*
     * // Newton Raphson Method
     * public static double f(double x) {
     * double guess = x / 2.0;
     * double epsilon = 1e-7;
     * 
     * while (Math.abs(guess * guess - x) > epsilon) {
     * guess = 0.5 * (guess + x / guess);
     * }
     * 
     * return guess;
     * }
     */

    public static void main(String[] args) {
        double x = 9;
        int n = 2;
        System.out.println(f(x, n));
    }
}
