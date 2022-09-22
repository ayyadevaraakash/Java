import java.util.Scanner;

class AutomorphicNumber {

    static int countDigits(int x) {
        int count = 0;
        while (x > 0) {
            count++;
            x /= 10;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int inputNumber = sc.nextInt();
        int digitCount = countDigits(inputNumber);
        int squareOfInput = inputNumber * inputNumber;
        System.out.println("Squared Value: " + squareOfInput);

        String squared = String.valueOf(squareOfInput);
        String toBeChecked = squared.substring(squared.length()-digitCount, squared.length());
        
        if (toBeChecked.equals(String.valueOf(inputNumber)))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");

        sc.close();
    }
}
