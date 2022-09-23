import java.util.Scanner;

public class BinarySearch {

  static int binarySearch(int[] arr, int low, int high, int x) {
    int mid = low + (high - low) / 2;
    if (low <= high) {
      if (x == arr[mid])
        return mid;
      else if (x < arr[mid])
        return binarySearch(arr, low, mid - 1, x);
      else
        return binarySearch(arr, mid + 1, high, x);
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int capacity = sc.nextInt();
    int[] arr = new int[capacity];
    System.out.print("Enter the elements: ");
    for (int i = 0; i < capacity; i++)
      arr[i] = sc.nextInt();
    System.out.print("Enter the element to be searched: ");
    int toBeSearched = sc.nextInt();
    int position = binarySearch(arr, 0, capacity - 1, toBeSearched);
    if (position == -1)
      System.out.println("Element not found");
    else
      System.out.println("Element found at index: " + position);
    sc.close();
  }
}
