// Question
// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

import java.util.Arrays;

class MergeArrays {
  public static void main(String[] args) {
    int[] arr1 = { 2, 5, 8, 11 };
    int[] arr2 = { 1, 3, 4, 12, 6 };

    int i = arr1.length - 1;
    int j = 0;

    while (i >= 0 && j < arr2.length) {
      if (arr1[i] > arr2[j]) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
        i--;
        j++;
      } else {
        break;
      }
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    System.out.println("Array 1: " + Arrays.toString(arr1));
    System.out.println("Array 2: " + Arrays.toString(arr2));
  }
}
