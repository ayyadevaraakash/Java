import java.util.Arrays;

public class NextPermutation {

  public static void reverse(int[] arr, int left, int right) {
    int mid = (right - left + 1) / 2;
    for (int i = 0; i < mid; i++, left++, right--) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
    }
  }

  public static void main(String[] args) {
    int[] permutation = { 1, 3, 6, 2, 4, 5 };
    int length = permutation.length;
    int n = length - 2;
    int pivot = -1, pointer = -1;

    while (n >= 0) {
      if (permutation[n] < permutation[n + 1]) {
        pivot = n;
        break;
      }
      n--;
    }

    if (pivot != -1) {
      for (int i = length - 1; i >= 0; i--) {
        if (permutation[i] > permutation[pivot]) {
          pointer = i;
          break;
        }
      }
      int temp = permutation[pointer];
      permutation[pointer] = permutation[pivot];
      permutation[pivot] = temp;
      reverse(permutation, pivot + 1, length - 1);
    } else
      reverse(permutation, 0, length - 1);

    System.out.println("Next Permutation: " + Arrays.toString(permutation));
  }
}

// Logic Notes

/*
 * Algorithm:
 * 1. Find the first non-increasing number starting from RHS (say we got it at p
 * index)
 * 2. Place a pointer at p + 1 (say q)
 * 3. Swap array[p] with the first number greater than it starting from RHS
 * 4. Reverse the array from q to the end
 * 
 * If we don't have any p from step 1, then simply reverse the entire array
 * 
 */
