// Program to check whether the given input is power of 2

import java.util.Scanner;

class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int inputNumber = sc.nextInt();
        if ((inputNumber & (inputNumber - 1)) == 0 && inputNumber != 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not a power of 2");
        sc.close();
    }
}

// Logic Notes
/*
 * Rule:
 * If a is power of 2, then a AND (a-1) will always yield 0
 */
