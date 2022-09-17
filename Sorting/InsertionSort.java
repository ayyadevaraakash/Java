import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity;
        System.out.print("Enter number of elements: ");
        capacity = sc.nextInt();
        int[] myArray = new int[capacity];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < capacity; i++)
            myArray[i] = sc.nextInt();
        // Logic
        for (int i = 1; i < capacity; i++) {
            int key = myArray[i];
            int j = i - 1;
            while (j >= 0 && key < myArray[j]) {
                myArray[j + 1] = myArray[j];
                j--;
            }
            myArray[j + 1] = key;
        }
        System.out.println("Sorted Array: " + Arrays.toString(myArray));
        sc.close();
    }
}
