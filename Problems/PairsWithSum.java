// Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

// Time Complexity: O(N)
// Auxiliary Space: O(N)

import java.util.Scanner;
import java.util.HashMap;

class PairsWithSum {

    static int getPairs(int[] arr, int reqSum) {
        HashMap<Integer, Integer> occurrence = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (occurrence.containsKey(reqSum - arr[i]))
                count += occurrence.get(reqSum - arr[i]);
            if (occurrence.containsKey(arr[i]))
                occurrence.put(arr[i], occurrence.get(arr[i]) + 1);
            else
                occurrence.put(arr[i], 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numberOfElements = sc.nextInt();
        int[] arr = new int[numberOfElements];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < numberOfElements; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter required sum: ");
        int requiredSum = sc.nextInt();
        int count = getPairs(arr, requiredSum);
        System.out.println("Count of pairs: " + count);
        sc.close();
    }
}
