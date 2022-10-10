// Given a number n < length of array. Do cyclic rotation of that many elements from end

import java.util.Arrays;

class CyclicRotation {

    static void reverse(int[] arr, int low, int high) {
        int mid = (high - low + 1) / 2;
        int m = low, n = high, temp;
        for (int i = 0; i < mid; i++, m++, n--) {
            temp = arr[m];
            arr[m] = arr[n];
            arr[n] = temp;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = { 12, 4, 9, 11, 5, 17 };
        int partition = arr.length - (n + 1);

        reverse(arr, 0, partition);
        reverse(arr, partition + 1, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}

// Logic

/*
 * Do reverse operation from partition. Resulting array will be a cyclic rotated
 * array
 */
