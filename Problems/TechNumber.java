import java.util.Scanner;

class TechNumber {

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
        String input = String.valueOf(inputNumber);

        String firstPart = input.substring(0, digitCount / 2);
        String secondPart = input.substring(digitCount / 2, input.length());

        int temp = Integer.parseInt(firstPart) + Integer.parseInt(secondPart);
        System.out.println(firstPart + " + " + secondPart + " = " + temp);

        int finalValue = temp * temp;
        System.out.println("Squaring " + temp + ": " + finalValue);

        if (inputNumber == finalValue)
            System.out.println("It's a tech number");
        else
            System.out.println("Not a tech number");

        sc.close();
    }
}
