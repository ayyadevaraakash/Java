// Find the missing number in the sequence from 0 to n

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9 };
        int val = arr[0];
        for (int i = 1; i < arr.length; i++)
            val ^= arr[i];
        for (int i = 1; i < arr[arr.length - 1] + 1; i++) {
            val ^= i;
        }
        System.out.println("Missing number is " + val);
    }
}

// EXOR operation with self results in zero
