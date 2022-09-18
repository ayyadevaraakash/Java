import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int inputNumber = sc.nextInt();
        int rem, sum = 0, product = 1;

        while (inputNumber > 0) {
            rem = inputNumber % 10;
            sum += rem;
            product *= rem;
            inputNumber /= 10;
        }

        System.out.println("Sum of its digits: " + sum);
        System.out.println("Product of its digits: " + product);

        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not a Spy Number");

        sc.close();
    }
}
