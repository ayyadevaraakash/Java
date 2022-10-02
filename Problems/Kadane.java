import java.util.Scanner;

public class Kadane {

    static void largestSum(int[] arr) {
        int start = 0, sum = 0, maxSum = Integer.MIN_VALUE, s = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (maxSum < sum) {
                maxSum = sum;
                start = s;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                s = i + 1;
            }
        }
        // Printing the largest sum contiguous subarray
        System.out.print("Subarray: ");
        for (int i = start; i < end + 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nLargest Sum: " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int capacity = sc.nextInt();
        int[] arr = new int[capacity];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < capacity; i++)
            arr[i] = sc.nextInt();
        largestSum(arr);
        sc.close();
    }
}
