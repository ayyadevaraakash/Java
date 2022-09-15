import java.util.Scanner;
import java.util.Arrays;;

class BubbleSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int capacity, temp;
    System.out.print("Enter the number of elements: ");
    capacity = sc.nextInt();
    int[] myArray = new int[capacity];
    System.out.print("Enter the elements: ");
    for (int i = 0; i < capacity; i++) {
      myArray[i] = sc.nextInt();
    }
    // Bubble Sort
    for (int i = 0; i < capacity; i++) {
      boolean swapped = false;
      for (int j = 0; j < capacity - 1; j++) {
        if (myArray[j + 1] < myArray[j]) {
          temp = myArray[j + 1];
          myArray[j + 1] = myArray[j];
          myArray[j] = temp;
          swapped = true;
        }
      }
      if (swapped == false)
        break;
    }
    System.out.println("Sorted Array: " + Arrays.toString(myArray));
    sc.close();
  }
}

/*
 * swapped variable is used for optimizing bubble sort.
 * If there is no swapping then it means that the array is already sorted so no
 * need to perform sorting again.
 */
