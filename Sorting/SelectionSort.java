import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < length; j++)
                if (arr[j] < arr[smallest])
                    smallest = j;
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
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
        selectionSort(arr);
        System.out.print("Sorted Array: " + Arrays.toString(arr));
        sc.close();
    }
}
