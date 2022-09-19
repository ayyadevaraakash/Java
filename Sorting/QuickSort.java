import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

  static int partition(int[] arr, int l, int r) {
    int pivot = arr[r];
    int i = l - 1;
    for (int j = l; j < r; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    // swap pivot
    int temp = arr[i + 1];
    arr[i + 1] = pivot;
    arr[r] = temp;

    return (i + 1);
  }

  static void quickSort(int[] arr, int l, int r) {
    if (l < r) {
      int point = partition(arr, l, r);

      quickSort(arr, l, point - 1);
      quickSort(arr, point + 1, r);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int capacity = sc.nextInt();
    int[] myArray = new int[capacity];
    System.out.print("Enter the elements: ");
    for (int i = 0; i < capacity; i++) {
      myArray[i] = sc.nextInt();
    }
    // Main part
    quickSort(myArray, 0, myArray.length - 1);
    System.out.println("Sorted Array: " + Arrays.toString(myArray));
    sc.close();
  }
}
