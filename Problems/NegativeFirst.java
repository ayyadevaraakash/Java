// Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

import java.util.Scanner;
import java.util.Arrays;

class NegativeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int capacity = sc.nextInt();
        int[] arr = new int[capacity];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < capacity; i++)
            arr[i] = sc.nextInt();
        int countOfNegatives = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                countOfNegatives++;
        }

        int[] newArr = new int[arr.length];
        int m = arr.length - countOfNegatives;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                newArr[m++] = arr[i];
            else
                newArr[n++] = arr[i];
        }

        System.out.println("Negatives Shifted: " + Arrays.toString(newArr));
        sc.close();
    }
}
