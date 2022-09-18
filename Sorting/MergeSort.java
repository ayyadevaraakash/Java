import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    static void merge(int myArr[], int p, int q, int r) {

        int l1 = q - p + 1;
        int l2 = r - q;

        int[] subArray1 = new int[l1];
        int[] subArray2 = new int[l2];

        for (int i = 0; i < l1; i++) {
            subArray1[i] = myArr[p + i];
        }

        for (int j = 0; j < l2; j++) {
            subArray2[j] = myArr[q + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = p;

        while (i < l1 && j < l2) {
            if (subArray1[i] <= subArray2[j]) {
                myArr[k++] = subArray1[i++];
            } else {
                myArr[k++] = subArray2[j++];
            }
        }

        while (i < l1) {
            myArr[k++] = subArray1[i++];
        }

        while (j < l2) {
            myArr[k++] = subArray2[j++];
        }
    }

    static void mergeSort(int myArr[], int l, int r) {

        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(myArr, l, mid);
            mergeSort(myArr, mid + 1, r);

            merge(myArr, l, mid, r);
        }
    }

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
        mergeSort(myArray, 0, myArray.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(myArray));
        sc.close();
    }
}
