// Given an array of size N containing only 0s, 1s, and 2s,
// Sort the array in ascending order.

import java.util.Arrays;

public class ZeroOneTwo {

    static void swap(int[] arr, int m, int n) {
        int temp;
        temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 0, 1, 2, 0 };
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                mid++;
                high--;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
