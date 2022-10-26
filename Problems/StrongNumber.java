class StrongNumber {

    static int getFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 145;
        int copy = n;
        int remainder, result = 0;
        while (n > 0) {
            remainder = n % 10;
            result += getFactorial(remainder);
            n /= 10;
        }
        if (copy == result)
            System.out.println("It's a strong number");
        else
            System.out.println("Not a strong number");
    }
}
