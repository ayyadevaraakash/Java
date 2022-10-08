public class TernarySearch {

  static int ternarySearch(int[] arr, int l, int r, int k) {

    if (r >= l) {

      int mid1 = l + (r - l) / 3;
      int mid2 = r - (r - l) / 3;

      if (arr[mid1] == k)
        return mid1;
      if (arr[mid2] == k)
        return mid2;

      if (k < arr[mid1])
        return ternarySearch(arr, l, mid1 - 1, k);
      else if (k > arr[mid2])
        return ternarySearch(arr, mid2 + 1, r, k);
      else
        return ternarySearch(arr, mid1 + 1, mid2 - 1, k);

    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 7, 8, 10, 23, 27 };
    int toBeSearched = 8;
    int position = ternarySearch(arr, 0, arr.length - 1, toBeSearched);
    if (position != -1)
      System.out.println("Element found at position " + position);
    else
      System.out.println("Element not found");
  }
}
