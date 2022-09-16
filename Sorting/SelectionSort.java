import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
        for (int i = 0; i < capacity - 1; i++) {
            int temp, minimum = myArray[i], index = i;
            for (int j = i + 1; j < capacity; j++) {
                if (myArray[j] < minimum) {
                    minimum = myArray[j];
                    index = j;
                }
            }
            temp = myArray[i];
            myArray[i] = minimum;
            myArray[index] = temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(myArray));
        sc.close();
    }
}
