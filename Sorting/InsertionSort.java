import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the array: ");
        int capacity = sc.nextInt();
        int arr[] = new int[capacity];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < capacity; i++)
            arr[i] = sc.nextInt();
        System.out.println("Input Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.print("Sorted Array: " + Arrays.toString(arr));
        sc.close();
    }
}
