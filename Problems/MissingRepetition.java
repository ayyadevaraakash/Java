// Given an array of numbers having 2 occurences each. Find the number with one occurence

public class MissingRepetition {
    public static void main(String[] args) {
        int[] arr = { 12, 12, 2, 2, 9 };
        int val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            val = val ^ arr[i];
        }
        System.out.println("Missing number: " + val);
    }
}
