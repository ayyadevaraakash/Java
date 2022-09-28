import java.util.Arrays;
import java.util.Scanner;

class KthSmallLargest {

    static void getKthSmallLarge(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.println("Kth Smallest: " + arr[k - 1]);
        System.out.println("Kth Largest: " + arr[arr.length - k]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int capacity = sc.nextInt();
        int[] arr = new int[capacity];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < capacity; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        if (k <= arr.length)
            getKthSmallLarge(arr, k);
        else
            System.out.println("Only " + capacity + " elements are there");
        sc.close();
    }
}
