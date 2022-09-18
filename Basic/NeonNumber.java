import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int inputNumber = sc.nextInt();
        int squareOfInputNumber = inputNumber * inputNumber;
        System.out.println("Square of " + inputNumber + ": " + squareOfInputNumber);
        int rem, sum = 0;

        while (squareOfInputNumber > 0) {
            rem = squareOfInputNumber % 10;
            sum += rem;
            squareOfInputNumber /= 10;
        }

        System.out.println("Sum of the digits of its square: " + sum);

        if (sum == inputNumber)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");

        sc.close();
    }
}
