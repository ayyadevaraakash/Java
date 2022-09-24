// Given an array of N positive integers and an integer X. The task is to find the frequency of X in the array.

public class FindFrequency {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 12, 5, 7, 7, 12 };
        int x = 12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count++;
        }
        System.out.println("Count of " + x + " is: " + count);
    }
}
