// Problem: https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1

import java.util.Arrays;

class MinimizeHeights {
    public static void main(String[] args) {
        int arr[] = { 3, 9, 12, 16, 20 };
        int length = arr.length;
        Arrays.sort(arr);
        int k = 3;

        int difference = arr[length - 1] - arr[0];
        int min, max;

        for (int i = 0; i < length - 1; i++) {
            max = Math.max(arr[i] + k, arr[length - 1] - k);
            min = Math.min(arr[i + 1] - k, arr[0] + k);

            if (min < 0)
                continue;
            else
                difference = Math.min(difference, max - min);
        }

        System.out.println("Minimum distance is: " + difference);

    }
}

// Logic

/*
 * Sort the array. Because after sorting the minimum heights can be obtained
 * with adjacent elements.
 * Kindly watch some good youtube video for the visual explanation.
 */
