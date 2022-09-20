import java.util.Scanner;

class LinearSearch {

  static int linearSearch(int[] arr, int k) {
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == k) {
        index = i + 1;
        break;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int capacity = sc.nextInt();
    int[] arr = new int[capacity];
    System.out.print("Enter the elements: ");
    for (int i = 0; i < capacity; i++)
      arr[i] = sc.nextInt();
    System.out.print("Enter the element for searching: ");
    int toBeSearched = sc.nextInt();
    // LOGIC
    int position = linearSearch(arr, toBeSearched);
    if (position != -1)
      System.out.println("Element is found at index " + position);
    else
      System.out.println("Element is not present in the array");
    sc.close();
  }
}
