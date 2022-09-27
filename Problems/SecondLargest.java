import java.util.Scanner;

class SecondLargest {

    static int getSecondLargest(int[] arr) {
        int max = -1;
        int secondMax = -1;

        // finding the greatest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // finding the second greatest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
        }

        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int capacity = sc.nextInt();
        if (capacity > 1) {
            int[] arr = new int[capacity];
            System.out.print("Enter the elements: ");
            for (int i = 0; i < capacity; i++)
                arr[i] = sc.nextInt();
            int value = getSecondLargest(arr);
            if (value == -1)
                System.out.println("Duplicate entries");
            else
                System.out.println("Second Largest Element is: " + value);
        } else {
            System.out.println("Need atleast 2 elements");
        }
        sc.close();
    }
}
